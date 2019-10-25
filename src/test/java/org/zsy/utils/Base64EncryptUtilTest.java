package org.zsy.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 张世一
 * @version 1.0
 */
public class Base64EncryptUtilTest {


    @Test
    public void encode() throws Exception {
        String encode = Base64EncryptUtil.encode("abc");
        assertEquals("YWJj", encode);
    }


    @Test
    public void decode() throws Exception {
        String str = "abc";
        String decode = Base64EncryptUtil.decode(Base64EncryptUtil.encode(str));
        assertEquals(decode, str);
    }
}