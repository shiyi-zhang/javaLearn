package org.zsy.utils;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;
import redis.clients.jedis.Tuple;


/**
 * Created by admin on 2018/3/16.
 */
public class RedisUtil {

     JedisPool jedisPool;

    public RedisUtil() {
        String ip = "127.0.0.1";
        int port = 6379;
        String password ="" ;
        JedisPoolConfig config = new JedisPoolConfig();
        // 为pool分配jedis实例个数
        config.setMaxTotal(10);
        // 控制一个pool最多有几个状态为空闲的jedis实例
        config.setMaxIdle(1000);
        if (password != null && password.trim().length() != 0) {
            jedisPool = new JedisPool(config, ip, port, 10000, password);
        } else {
            // 获取连接池10000毫秒延时
            jedisPool = new JedisPool(config, ip, port, 10000);
        }
    }

    private Jedis getJedis() {
        return jedisPool.getResource();
    }

    private void close(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }

    /**
     * 缓存键值对
     *
     * @param key String 健
     * @param value String 值
     */
    public void set(String key, String value) {
        Jedis jedis = getJedis();
        jedis.set(key, value);
        close(jedis);
    }

    /**
     * 缓存Map<String,String>键值对
     *
     * @param key String 健
     * @param map Map<String,String> 值
     */
    public void setMap(String key, Map<String, String> map) {
        Jedis jedis = getJedis();
//        jedis.del(key);
        if (!map.isEmpty()) {
//            System.out.println(key);
//            System.out.println(map.size());
            jedis.hmset(key, map);
        }

        close(jedis);
    }

    public void delKeys(String pattern) {
        Jedis jedis = getJedis();
        Set<String> keys = jedis.keys(pattern);
        if (keys.size() > 0) {
            String[] delKeys = keys.toArray(new String[0]);
            Long del = jedis.del(delKeys);
//            System.out.println("del******"+pattern);
//            System.out.println(del);
        }
        close(jedis);
    }

    /**
     * 缓存键值对
     *
     * @param key String 健
     * @param value String 值
     */
    public void setMap(String key, String field, String value) {
        Jedis jedis = getJedis();
        jedis.set(key, value);
        close(jedis);
    }

    /**
     * 通过健获取值
     *
     * @param key String 健
     * @return 值
     */
    public String get(String key) {
        Jedis jedis = getJedis();
        String value = jedis.get(key);
        close(jedis);
        return value;
    }

    /**
     * 设置过期时间
     *
     * @param key 健
     * @param seconds 过期时间（秒）
     */
    public void expire(String key, int seconds) {
        if (seconds <= 0) {
            return;
        }
        Jedis jedis = getJedis();
        jedis.expire(key, seconds);
        close(jedis);
    }


    /**
     * 删除指定的缓存
     *
     * @param keys 健
     */
    public void del(String... keys) {
        if (keys == null) {
            return;
        }
        Jedis jedis = getJedis();
        jedis.del(keys);
        close(jedis);
    }

    /**
     * 往Redis中设定HashMap的自加
     *
     * @param key KEY名
     * @param field 字段名
     * @param count 需要增加的值
     * @return 增加后的值
     */
    public Long hincrBy(String key, String field, int count) {
        if (StringUtils.isBlank(key) || StringUtils.isBlank(field)) {
            return null;
        }
        Long tempLong = 0L;
        Jedis jedis = null;
        try {
            jedis = getJedis();
            tempLong = jedis.hincrBy(key, field, count);
        } finally {
            close(jedis);
        }
        return tempLong;
    }

    public String hget(String key, String field) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        String value = null;
        Jedis jedis = null;
        try {
            jedis = getJedis();
            value = jedis.hget(key, field);
        } finally {
            close(jedis);
        }
        return value;
    }

    /**
     * 通过Key获取Redis中的数据
     *
     * @param key Key名
     * @return 返回存储数据
     */
    public Map<String, String> hgetAll(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        Map<String, String> countMap = null;
        Jedis jedis = null;
        try {
            jedis = getJedis();
            countMap = jedis.hgetAll(key);
        } finally {
            close(jedis);
        }
        return countMap;
    }

    /**
     * 判断指定的Key是否存在
     *
     * @param key 指定的Key
     * @return 返回结果:true:存在 false:不存在
     */
    public boolean exists(String key) {
        if (StringUtils.isBlank(key)) {
            return false;
        }
        Jedis jedis = getJedis();
        boolean isExists = jedis.exists(key);
        close(jedis);
        return isExists;
    }

    /**
     * 添加锁处理
     *
     * @param key 健值
     * @param count 尝试获取次数
     * @return 是否成功获取到锁， true：成功 false：失败
     */
    public synchronized boolean lock(String key, Integer count) {
        if (StringUtils.isBlank(key)) {
            return false;
        }
        if (count == null) {
            count = 0;
        }
        Jedis jedis = getJedis();
        int i = 0;
        try {
            while (true) {
                Long setnx = jedis.setnx(key, "1");
                if (setnx.intValue() == 1) {
                    jedis.expire(key, 5);
                    return true;
                }
                if (i == count) {
                    return false;
                }
                i++;
                Thread.sleep(20);
            }
        } catch (Exception e) {
            return false;
        } finally {
            close(jedis);
        }
    }

    /**
     * 删除分布式锁
     *
     * @param key 删除的Key
     */
    public void unLock(String key) {
        this.del(key);
    }

    /**
     * set集合添加元素
     *
     * @param key 添加的key
     * @param value 添加的元素
     */
    public void sadd(String key, String... value) {
        Jedis jedis = getJedis();
        jedis.sadd(key, value);
        close(jedis);
    }

    public void sadd(String key, List<String> value) {
        Jedis jedis = getJedis();
        jedis.sadd(key, value.toArray(new String[]{}));
        close(jedis);
    }

    public void srem(String key, String... values) {
        Jedis jedis = getJedis();
        jedis.srem(key, values);
        close(jedis);
    }

    public Set<Tuple> zrangeWithScores(String key, long start, long end) {
        Jedis jedis = getJedis();
        Set<Tuple> zrange = jedis.zrangeWithScores(key, start, end);
        close(jedis);
        return zrange;
    }

    public void zadd(String key, double score, String member) {
        Jedis jedis = getJedis();
        jedis.zadd(key, score, member);
        close(jedis);
    }

    public void zadd(String key, Map<String, Double> scoreMembers) {
        Jedis jedis = getJedis();
        jedis.zadd(key, scoreMembers);
        close(jedis);
    }

    public Long hdel(String key, String... filed) {
        Jedis jedis = getJedis();
        Long count = jedis.hdel(key, filed);
        close(jedis);
        return count;
    }

    public void hset(String key, String filed, String value) {
        Jedis jedis = getJedis();
        jedis.hset(key, filed, value);
        close(jedis);
    }

    public List<String> keys(String key) {
        Jedis jedis = getJedis();
        List<String> list = new ArrayList<>();
        String cursor = ScanParams.SCAN_POINTER_START;
        ScanParams match = new ScanParams().match(key);
        ScanResult<String> result = null;
        while (true) {
            result = jedis.scan(cursor, match);
            cursor = result.getStringCursor();
            list.addAll(result.getResult());
            if ("0".equals(cursor)) {
                break;
            }
        }
        close(jedis);
        return list;
    }

    /**
     * 发布一个消息
     */
    public void publishMsg(String channel, String message) {
        Jedis jedis = getJedis();
        jedis.publish(channel, message);
        close(jedis);
    }

    /**
     * 将一个或多个值 value 插入到列表 key 的表头
     */
    public void lpush(String key, String... field) {
        Jedis jedis = getJedis();
        jedis.lpush(key, field);
        close(jedis);
    }

    /**
     * 移除并返回列表 key 的尾元素。
     */
    public String rpop(String key) {
        Jedis jedis = getJedis();
        String value = jedis.rpop(key);
        close(jedis);
        if ("nil".equals(value)) {
            return null;
        }
        return value;
    }

    /**
     * 当给定多个 key 参数时，按参数 key 的先后顺序依次检查各个列表，弹出第一个非空列表的尾部元素。
     */
    public List<String> brpop(String... key) {
        Jedis jedis = getJedis();
        List<String> list= jedis.brpop(key);
        close(jedis);
        return list;
    }

    public static void main(String[] args) throws Exception{
        RedisUtil redisUtil=new RedisUtil();
        Map<String, String> stringMap = redisUtil.hgetAll("TASK_UNENFORCED");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date bt=simpleDateFormat.parse("2019-12-26");
        stringMap.forEach((k,v)->{
            try {
                final Date  et =sdf.parse( k.substring(0, 8));
                if (et.after(bt)){
                    redisUtil.lpush("TASK_UNENFORCED_at",v);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }
}
