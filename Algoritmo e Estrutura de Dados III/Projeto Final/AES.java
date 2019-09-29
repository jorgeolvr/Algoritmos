import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AES{
    private static SecretKey key;
    Cipher cipher = Cipher.getInstance("AES");

    public AES(String strkey) throws Exception{
        key = new SecretKeySpec(strkey.getBytes(), "AES");
    }

    public byte[] encrypt(byte[] data) throws Exception{
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptData = cipher.doFinal(data);
        return encryptData;
    }

    public byte[] decrypt(byte[] data) throws Exception{
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptData = cipher.doFinal(data);
        return decryptData;
    }
}
