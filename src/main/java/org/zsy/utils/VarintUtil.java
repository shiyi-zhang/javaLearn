package org.zsy.utils;

/**
 * @author 张世一
 * @version 1.0
 */
public class VarintUtil {

    static void write32ForVarint(int value,byte[] buffer,int position){
        while (true) {
            if ((value & ~0x7F) == 0) {
                buffer[position++] = (byte) value;
                return ;
            } else {
                buffer[position++] = (byte) ((value & 0x7F) | 0x80);
                //|0x80代表首位bit置1
                value >>>= 7;
            }
        }
    }

    static int read32ForVarint(byte[] buffer,int position){
        int result = 0;
        for (int shift = 0; shift < 32; shift += 7) {
            //这个32 可以写29反正只要大于或等于28就行。
            final byte b = buffer[position++];
            result |= (long) (b & 0x7F) << shift;
            if ((b & 0x80) == 0) {
                return result;
            }
        }
        return -1;
    }


}
