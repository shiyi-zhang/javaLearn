package org.zsy.utils;

import java.math.BigInteger;

/**
 * Zigzag编码
 * @author 张世一
 * @version 1.0
 */
public class ZigzagUtil {

    // 传入的参数n = 传入字段值的二进制表示（此处以负数为例）
    // 负数的二进制 = 符号位为1，剩余的位数为 该数绝对值的原码按位取反；然后整个二进制数+1
    public static int int_to_zigzag(int n) {
        return (n << 1) ^ (n >> 31);
        // 对于sint 32 数据类型，使用Zigzag编码过程如下：
        // 1. 将二进制表示数 左移1位（左移 = 整个二进制左移，低位补0）
        // 2. 将二进制表示数 右移31位
        // 对于右移：
        // 首位是1的二进制（有符号数），是算数右移，即右移后左边补1
        // 首位是0的二进制（无符号数），是逻辑左移，即右移后左边补0
        // 3. 将上述二者进行异或

        // 对于sint 64 数据类型 则为： return  (n << 1> ^ (n >> 63) ；
    }


    // 附：将Zigzag值解码为整型值
    public static int zigzag_to_int(int n) {
        return (n >>> 1) ^ -(n & 1);
        // 右移时，需要用不带符号的移动，否则如果第一位数据位是1的话，就会补1
    }

    public static void main(String[] args) {
        String str = "850668 96 310004 0";
        String n=new BigInteger(str,10).toString(32);
        System.out.println(n);
//        System.out.println("原字符串：" + n);
//        int compress = int_to_zigzag(n);
//        System.out.println("压缩后字符串：" + compress);
//        int string = zigzag_to_int(compress);
//        System.out.println("解压缩后字符串：" + string);
    }

}
