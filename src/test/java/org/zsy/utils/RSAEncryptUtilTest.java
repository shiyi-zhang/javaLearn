package org.zsy.utils;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 张世一
 * @version 1.0
 */
public class RSAEncryptUtilTest {


    @Test
    public void decryptByPrivateKey() throws Exception {
        String privateKey="MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDdfX3RHF2O3CsFGG21LVw7kS1uFAZg1D"
            + "/Bp7xeCIbiYmtOnwdW/ldsk4uMKSjAI3uL6Zu1PE4ipImsAZ25lqkUvpj8PEsCtnbHHrumikwaPEqdMMzUJMVHt2wSSLIV5GLhxYV5E6pXjcHuId1TQP874wcq/9J0qywhtLYJqgYhdpuEVWL2diGj6z27waQf4QrHkM+3HDBRImVmXPkyqbRbu2GIx6Fro1XH+mFQbp2sc5EuPli3toHJ3OzuHlAM+P4H3dedJBYqbc9LcnK1TqhYuNwaIFaPiz3YQqa/pTupLZjsFrpdDvd9dqoTq9ekMGS8ruTvP56L6aqR6eyfHIWLAgMBAAECggEBAJeTc/ERSm2j+sTn7NxaiI4zUjXM+nh1iJRM6Dop97UhyXHqnylHsiiZ6Jwo5rxnC/u6CVdER+ypUZYnHPuPQXLy5Ntpn6PhnvOx8pWMe3xQ2ncsmGBuMZxcyFbS7RzSSWFcvXUYojB80MTY5BA/oOwo+BTTMgGpyu/eLd37P2rR7BXCLiLnH2VZiDgrvsfsforq40XdccyDv+j1I2Q6Zcc+f8EtsgLW2ADd/Da8hK8QVfPV5duWkt6P2W0zOaqipFiL1aHyg86tzeXb680JBBcKjStCMWxRJlDNux5IAtOoCJbA575m3tW2x6WdlKyq1VYkGuFFfcuJLN6zqUm5UiECgYEA/ao5piTHjOnc06rxmDOCKJkmbA8+3GHvftcpnq3frVA2OoakPYD2BEBkOeAGDW0VAmUeBVs3U9OPIX57zLfKXRBQPS9QT4eRIhmBP4vAL74pL2gKHgIoOOkQuaUuV957+1lym9/AScXC978tUrYtLsXIvoL42vwJjkVGCumG7gkCgYEA34dx3uCysF+L2prI3E9N6rwxKR9Zl1J/DZ7M0IoHvdCClutpl0MWdwJrwssDAAii1H1fJhD0rhks1lULKxysCZkEgm8mkJ7+iFjBzaLJuWk9vfIwuX2+bBaLjWSakcJvbNWKbj6S52jsagIt14iEZ1rtfv2TMr8QHJ6mAUzou/MCgYEA4Usx/oVGErqW3gxCnVqKLMKxJGJ6A0SccLxrA7sMIaNPNrXk45dJacdC/UAiQAR1F3Z1rm4weqw4wJfVHqLSAcv+aAlAvBH87htW9viJTh4H+EngSnzB+qHNsASsX3CED16HczfMUflqS54pg/+3q4YQ4Fv06JHXbtvJ9OEqbPkCgYAc/cAzHAmQ/pNxAupSSKbebxIhN0OzcKux5IrD8WMXp1eIo3fKepULUnEPjq0Q8A3OaYRRt5lEi1dZZSZRrSJTDFmdYTUrRLPWk0xvk1F+jrvHSwYuyLRN6I6pBAdYKFOzVe7iZZNAGEexaB7x+W7SyORMuC7DQiygyaLWQFdfKQKBgQCIJsTIi4veHXB2GzRClDglfcLqlbzqPiKkLxL+JoRpGTgc4GjZL9WZgrcN8k7t748u7NMYsUU60IBAuhxpgE8dCb9Fym2pND/JuBxPrva34PwckmWRw1Wyb9HhUUO2N2NQIzIRtxqXYwQhX+TKhKTzAkai8BFJNJs/FHDfwdfCJQ==";
        PrivateKey privateRSAKey = RSAEncryptUtil.getPrivateRSAKey(privateKey);

        String publicKey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3X190RxdjtwrBRhttS1cO5EtbhQGYNQ"
            + "/wae8XgiG4mJrTp8HVv5XbJOLjCkowCN7i+mbtTxOIqSJrAGduZapFL6Y/DxLArZ2xx67popMGjxKnTDM1CTFR7dsEkiyFeRi4cWFeROqV43B7iHdU0D/O+MHKv/SdKssIbS2CaoGIXabhFVi9nYho+s9u8GkH+EKx5DPtxwwUSJlZlz5Mqm0W7thiMeha6NVx/phUG6drHORLj5Yt7aBydzs7h5QDPj+B93XnSQWKm3PS3JytU6oWLjcGiBWj4s92EKmv6U7qS2Y7Ba6XQ73fXaqE6vXpDBkvK7k7z+ei+mqkensnxyFiwIDAQAB";
        PublicKey publicRSAKey = RSAEncryptUtil.getPublicRSAKey(publicKey);
        byte[] encryptDytes = RSAEncryptUtil.encryptByPublicKey("abc".getBytes(),publicRSAKey.getEncoded() );
        byte[] decryptBytes = RSAEncryptUtil.decryptByPrivateKey(encryptDytes,privateRSAKey.getEncoded() );

        Assert.assertEquals("abc",new String( decryptBytes));
    }

    @Test
    public void decryptByPublicKey() {

    }

    @Test
    public void encryptByPublicKey() throws Exception {
        String key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3X190RxdjtwrBRhttS1cO5EtbhQGYNQ"
            + "/wae8XgiG4mJrTp8HVv5XbJOLjCkowCN7i+mbtTxOIqSJrAGduZapFL6Y/DxLArZ2xx67popMGjxKnTDM1CTFR7dsEkiyFeRi4cWFeROqV43B7iHdU0D/O+MHKv/SdKssIbS2CaoGIXabhFVi9nYho+s9u8GkH+EKx5DPtxwwUSJlZlz5Mqm0W7thiMeha6NVx/phUG6drHORLj5Yt7aBydzs7h5QDPj+B93XnSQWKm3PS3JytU6oWLjcGiBWj4s92EKmv6U7qS2Y7Ba6XQ73fXaqE6vXpDBkvK7k7z+ei+mqkensnxyFiwIDAQAB";
        PublicKey publicRSAKey = RSAEncryptUtil.getPublicRSAKey(key);
        byte[] bytes = RSAEncryptUtil.encryptByPublicKey("abc".getBytes(),publicRSAKey.getEncoded() );
        String txt = Base64EncryptUtil.encode(bytes);
        Assert.assertNotNull(txt);
    }

    @Test
    public void encryptByPrivateKey() {
    }

    @Test
    public void getPrivateKey() throws Exception {
        Map<String, Key> keyMap = RSAEncryptUtil.initKey();
        Key privateKey = RSAEncryptUtil.getPrivateKey(keyMap);
        Assert.assertNotNull(privateKey);
    }

    @Test
    public void getPrivateKeyByte() {
    }

    @Test
    public void getPublicKey() throws Exception {
        Map<String, Key> keyMap = RSAEncryptUtil.initKey();
        Key publicKey = RSAEncryptUtil.getPublicKey(keyMap);
        Assert.assertNotNull(publicKey);
    }

    @Test
    public void getPublicKeyByte() {
    }

    @Test
    public void initKey() throws Exception {
        Map<String, Key> stringKeyMap = RSAEncryptUtil.initKey();
        System.out.println(stringKeyMap);
    }

    @Test
    public void initKey1() {
    }

    @Test
    public void initKey2() {
    }

    @Test
    public void getPublicRSAKey() throws Exception {
        String key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3X190RxdjtwrBRhttS1cO5EtbhQGYNQ"
            + "/wae8XgiG4mJrTp8HVv5XbJOLjCkowCN7i+mbtTxOIqSJrAGduZapFL6Y/DxLArZ2xx67popMGjxKnTDM1CTFR7dsEkiyFeRi4cWFeROqV43B7iHdU0D/O+MHKv/SdKssIbS2CaoGIXabhFVi9nYho+s9u8GkH+EKx5DPtxwwUSJlZlz5Mqm0W7thiMeha6NVx/phUG6drHORLj5Yt7aBydzs7h5QDPj+B93XnSQWKm3PS3JytU6oWLjcGiBWj4s92EKmv6U7qS2Y7Ba6XQ73fXaqE6vXpDBkvK7k7z+ei+mqkensnxyFiwIDAQAB";
        PublicKey publicRSAKey = RSAEncryptUtil.getPublicRSAKey(key);
        System.out.println(publicRSAKey);
    }

    @Test
    public void getPrivateRSAKey() throws Exception {
        String key="MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDdfX3RHF2O3CsFGG21LVw7kS1uFAZg1D"
            + "/Bp7xeCIbiYmtOnwdW/ldsk4uMKSjAI3uL6Zu1PE4ipImsAZ25lqkUvpj8PEsCtnbHHrumikwaPEqdMMzUJMVHt2wSSLIV5GLhxYV5E6pXjcHuId1TQP874wcq/9J0qywhtLYJqgYhdpuEVWL2diGj6z27waQf4QrHkM+3HDBRImVmXPkyqbRbu2GIx6Fro1XH+mFQbp2sc5EuPli3toHJ3OzuHlAM+P4H3dedJBYqbc9LcnK1TqhYuNwaIFaPiz3YQqa/pTupLZjsFrpdDvd9dqoTq9ekMGS8ruTvP56L6aqR6eyfHIWLAgMBAAECggEBAJeTc/ERSm2j+sTn7NxaiI4zUjXM+nh1iJRM6Dop97UhyXHqnylHsiiZ6Jwo5rxnC/u6CVdER+ypUZYnHPuPQXLy5Ntpn6PhnvOx8pWMe3xQ2ncsmGBuMZxcyFbS7RzSSWFcvXUYojB80MTY5BA/oOwo+BTTMgGpyu/eLd37P2rR7BXCLiLnH2VZiDgrvsfsforq40XdccyDv+j1I2Q6Zcc+f8EtsgLW2ADd/Da8hK8QVfPV5duWkt6P2W0zOaqipFiL1aHyg86tzeXb680JBBcKjStCMWxRJlDNux5IAtOoCJbA575m3tW2x6WdlKyq1VYkGuFFfcuJLN6zqUm5UiECgYEA/ao5piTHjOnc06rxmDOCKJkmbA8+3GHvftcpnq3frVA2OoakPYD2BEBkOeAGDW0VAmUeBVs3U9OPIX57zLfKXRBQPS9QT4eRIhmBP4vAL74pL2gKHgIoOOkQuaUuV957+1lym9/AScXC978tUrYtLsXIvoL42vwJjkVGCumG7gkCgYEA34dx3uCysF+L2prI3E9N6rwxKR9Zl1J/DZ7M0IoHvdCClutpl0MWdwJrwssDAAii1H1fJhD0rhks1lULKxysCZkEgm8mkJ7+iFjBzaLJuWk9vfIwuX2+bBaLjWSakcJvbNWKbj6S52jsagIt14iEZ1rtfv2TMr8QHJ6mAUzou/MCgYEA4Usx/oVGErqW3gxCnVqKLMKxJGJ6A0SccLxrA7sMIaNPNrXk45dJacdC/UAiQAR1F3Z1rm4weqw4wJfVHqLSAcv+aAlAvBH87htW9viJTh4H+EngSnzB+qHNsASsX3CED16HczfMUflqS54pg/+3q4YQ4Fv06JHXbtvJ9OEqbPkCgYAc/cAzHAmQ/pNxAupSSKbebxIhN0OzcKux5IrD8WMXp1eIo3fKepULUnEPjq0Q8A3OaYRRt5lEi1dZZSZRrSJTDFmdYTUrRLPWk0xvk1F+jrvHSwYuyLRN6I6pBAdYKFOzVe7iZZNAGEexaB7x+W7SyORMuC7DQiygyaLWQFdfKQKBgQCIJsTIi4veHXB2GzRClDglfcLqlbzqPiKkLxL+JoRpGTgc4GjZL9WZgrcN8k7t748u7NMYsUU60IBAuhxpgE8dCb9Fym2pND/JuBxPrva34PwckmWRw1Wyb9HhUUO2N2NQIzIRtxqXYwQhX+TKhKTzAkai8BFJNJs/FHDfwdfCJQ==";
        PrivateKey privateRSAKey = RSAEncryptUtil.getPrivateRSAKey(key);
        System.out.println(privateRSAKey);

    }
}