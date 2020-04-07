package org.zsy.utils;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author 张世一
 * @version 1.0
 */
public class RLCUtil {

    /**
     * 游程编码 压缩的实现--
     *
     * @param src 原始字符串
     * @param num_len 重复字符的最大长度的位数
     * @return 压缩后结果
     */
    public static String RLCEncoding(String src, int num_len) {
        String STR_FORMAT = "";
        for (int i = 0; i < num_len; i++) {
            STR_FORMAT = STR_FORMAT + "0";
        }

        DecimalFormat df = new DecimalFormat(STR_FORMAT);
        StringBuffer sbuffer = new StringBuffer();

        int length = src.length();

        char c = src.charAt(0);
        int current_size = 0;
        for (int i = 0; i <= length; i++) {

            if (i == length) {
                sbuffer.append(df.format(current_size)).append(c);
                break;
            }
            char c1 = src.charAt(i);

            if (c == c1) {
                current_size++;
            } else {
                sbuffer.append(df.format(current_size)).append(c);
                current_size = 1;
                c = c1;
            }
        }

        return sbuffer.toString();
    }

    /**
     * 游程编码 解压缩的实现
     *
     * @param src 原始字符串
     * @param num_len 重复字符的最大长度的位数
     * @return 解压缩的结果
     */
    public static String RLCDecoding(String src, int num_len) throws ParseException {

        int num_len_1 = ++num_len;
        String STR_FORMAT = "";
        for (int i = 0; i < num_len; i++) {
            STR_FORMAT = STR_FORMAT + "0";
        }

        DecimalFormat df = new DecimalFormat(STR_FORMAT);

        StringBuffer sbuffer = new StringBuffer();

        int size = src.length() / num_len_1;

        for (int i = 0; i < size; i++) {
            String substring = src.substring(i * num_len_1, (i + 1) * num_len_1);
            long l = df.parse(substring).longValue();
            long len = l / 10;
            int numChar = (int) (l % 10);

            for (long i1 = 0; i1 < len; i1++) {
                sbuffer.append(numChar);
            }
        }

        return sbuffer.toString();
    }

    public static void main(String[] args)throws Exception {
        String str = "850668963100040";
        String rlcEncoding = RLCEncoding(str, 2);
        System.out.println(rlcEncoding);
        String decoding = RLCDecoding(rlcEncoding,2);
        System.out.println(decoding);
//        System.out.println(str);
    }

}
