package org.zsy.utils;

import java.util.Arrays;

/**
 * @author 张世一
 * @version 1.0
 */
public class BWTUtil {

    public static void main(String[] args) {
        String str = "850668963100040";
        String enCodeStr = enCode(str);
        System.out.println("编码后的字符串是："+enCodeStr.split(":")[0]);
        System.out.println("编码钱的字符串是："+str);
        System.out.println("解码后的字符串是："+deCode(enCodeStr.split(":")[0],enCodeStr.split(":")[1]));
    }

    // bwt编码
    public static String enCode(String line) {
        String str = line + "$";
        int len = str.length();
        char[] charArray = str.toCharArray();
        char[][] ch = new char[len][len];
        char[] c_tmp = charArray.clone();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                ch[i][j] = c_tmp[j];
            }
            char zj = c_tmp[len - 1];
            for (int k = len - 1; k > 0; k--) {
                c_tmp[k] = c_tmp[k - 1];
            }
            c_tmp[0] = zj;
        }
        String[] strings = new String[len];
        for (int i = 0; i < len; i++) {
            StringBuffer chline = new StringBuffer();
            for (char c : ch[i]) {
                chline.append(c);
            }
            strings[i] = chline.toString();
        }
        Arrays.sort(strings);
        StringBuffer sBuffer = new StringBuffer();
        StringBuffer sBuffer2 = new StringBuffer();
        for (String s : strings) {
            sBuffer.append(s.substring(len - 1, len));
        }
        for (String s2 : strings) {
            sBuffer2.append(s2.substring(0, 1));
        }
        return sBuffer.toString() + ":" + sBuffer2.toString();
    }

    // bwt解码
    public static String deCode(String str1, String str2) {
        int len = str1.length();
        char[] L = str1.toCharArray();
        char[] F = str2.toCharArray();
        int[] L1 = new int[len];
        int[] F1 = new int[len];
        for (int i = 0; i < len; i++) {
            L1[i] = 1;
            F1[i] = 1;
        }
        for (int i = 0; i < len - 1; i++) {
            int num = 1;
            int num1 = 1;
            for (int j = i + 1; j < len; j++) {
                if (L[i] == L[j] && L1[j] == 1) {
                    num++;
                    L1[j] = num;
                }
                if (F[i] == F[j] && F1[j] == 1) {
                    num1++;
                    F1[j] = num1;
                }
            }
        }
        char result[] = new char[len];
        result[len - 1] = '$';
        result[len - 2] = L[0];
        int newlen = len - 2;
        int n1 = 0;
        while (newlen > 0) {
            for (int i = 0; i < len; i++) {
                if (F[i] == L[n1] && L1[n1] == F1[i]) {
                    newlen--;
                    result[newlen] = L[i];
                    n1 = i;
                    break;
                }
            }
        }
        String resultline = "";
        for (int i = 0; i < len - 1; i++) {
            resultline = resultline + result[i];
        }
        return resultline;
    }
}
