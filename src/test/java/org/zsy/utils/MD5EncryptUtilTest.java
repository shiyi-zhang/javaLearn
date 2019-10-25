package org.zsy.utils;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author 张世一
 * @version 1.0
 */
public class MD5EncryptUtilTest {

    @Test
    public void encodeMD5() throws Exception {
        byte[] encodeMD5 = MD5EncryptUtil.encodeMD5("abc");
        assertEquals(HexUtil.encodeHexStr( encodeMD5),"900150983cd24fb0d6963f7d28e17f72");
    }

    @Test
    public void encodeMD5Hex() throws Exception {
        String abc = MD5EncryptUtil.encodeMD5Hex("abc");
        System.out.println(abc);
        assertEquals(abc,"900150983cd24fb0d6963f7d28e17f72");
    }
}