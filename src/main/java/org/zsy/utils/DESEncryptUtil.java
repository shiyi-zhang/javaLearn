package org.zsy.utils;

import java.security.Key;
import java.security.SecureRandom;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @author 张世一
 * @version 1.0
 */
public class DESEncryptUtil {

    static {
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
    }

    /**
     * 密钥算法 <br> Java 6 只支持56bit密钥 <br> Bouncy Castle 支持64bit密钥
     */
    public static final String KEY_ALGORITHM = "DES";

    /**
     * 加密/解密算法 / 工作模式 / 填充方式
     */
    public static final String CIPHER_ALGORITHM = "DES/ECB/PKCS5PADDING";

    /**
     * 转换密钥
     *
     * @param key 二进制密钥
     * @return Key 密钥
     */
    private static Key toKey(byte[] key) throws Exception {

        // 实例化DES密钥材料
        DESKeySpec dks = new DESKeySpec(key);

        // 实例化秘密密钥工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);

        // 生成秘密密钥
        SecretKey secretKey = keyFactory.generateSecret(dks);

        return secretKey;
    }

    /**
     * 解密
     *
     * @param data 待解密数据
     * @param key 密钥
     * @return byte[] 解密数据
     */
    public static byte[] decrypt(byte[] data, byte[] key) throws Exception {

        // 还原密钥
        Key k = toKey(key);

        // 实例化
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);

        // 初始化，设置为解密模式
        cipher.init(Cipher.DECRYPT_MODE, k);

        // 执行操作
        return cipher.doFinal(data);
    }

    /**
     * 加密
     *
     * @param data 待加密数据
     * @param key 密钥
     * @return byte[] 加密数据
     */
    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {

        // 还原密钥
        Key k = toKey(key);

        // 实例化
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);

        // 初始化，设置为加密模式
        cipher.init(Cipher.ENCRYPT_MODE, k);

        // 执行操作
        return cipher.doFinal(data);
    }

    /**
     * 生成密钥 <br> Java 6 只支持56bit密钥 <br> Bouncy Castle 支持64bit密钥 <br>
     *
     * @return byte[] 二进制密钥
     */
    public static byte[] initKey() throws Exception {

        /*
         * 实例化密钥生成器
         *
         * 若要使用64bit密钥注意替换 将下述代码中的KeyGenerator.getInstance(CIPHER_ALGORITHM);
         * 替换为KeyGenerator.getInstance(CIPHER_ALGORITHM, "BC");
         */
        KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);

        /*
         * 初始化密钥生成器 若要使用64bit密钥注意替换 将下述代码kg.init(56); 替换为kg.init(64);
         */
        kg.init(56, new SecureRandom());

        // 生成秘密密钥
        SecretKey secretKey = kg.generateKey();

        // 获得密钥的二进制编码形式
        return secretKey.getEncoded();
    }

    public static byte[] initKey(String seed) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);
        SecureRandom secureRandom = new SecureRandom(new Base64().decode(seed));
        kg.init(secureRandom);
        SecretKey secretKey = kg.generateKey();
        return secretKey.getEncoded();
    }

}