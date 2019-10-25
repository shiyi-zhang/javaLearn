package org.zsy.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张世一
 * @version 1.0
 */
public class AsciiUtil {

    public static String stringToAscii(String value) {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                sbu.append((int) chars[i]).append(",");
            } else {
                sbu.append((int) chars[i]);
            }
        }
        return sbu.toString();
    }

    public static String asciiToString(String value) {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }

    public static void main(String[] args) {
        String str = "891132245411031";
        List<String> result = new ArrayList<String>();
        String tmp = null;
        for (int index = 0; index < str.length(); index += 2) {

            if ((index + 2) > str.length()) {
                tmp =  str.substring(index);
            } else {
                tmp = str.substring(index, index + 2);
            }

            if (Integer.valueOf(tmp) < 33 ) {
                tmp = String.valueOf(Integer.valueOf(tmp) + 100);
            }
            result.add(tmp);
        }
        System.out.println("原字符串：" + result);

        for (String ttmp : result) {
            String string = asciiToString(ttmp);
            System.out.println("解压缩后字符串：" + string);
        }

    }

}
