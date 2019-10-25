package org.zsy.utils;

import static org.junit.Assert.*;

import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 张世一
 * @version 1.0
 */
public class AESEncryptUtilTest {

    private String key="74c89478c1b8a20379bf67f3924460db" ;


    @Test
    public void decrypt() throws Exception {
        String str = "abc";
        String decrypt = AESEncryptUtil.decrypt(AESEncryptUtil.encrypt(str, key), key);
        assertEquals(decrypt, str);
    }

//    @Before
    public void setUp() throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128, new SecureRandom("111".getBytes()));
        SecretKey secretKey = kgen.generateKey();
        byte[] enCodeFormat = secretKey.getEncoded();
        key = HexUtil.encodeHexStr(enCodeFormat);
        System.out.println(key);
    }
}