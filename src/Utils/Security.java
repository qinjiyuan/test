package Utils;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class Security {
	/**
     * ����
     * @param content ����������
     * @param password  ������Կ
     * @return
     */
	 public static byte[] encrypt(String content, String password) {
	        try {
	            KeyGenerator kgen = KeyGenerator.getInstance("AES");
	            kgen.init(128, new SecureRandom(password.getBytes()));
	            SecretKey secretKey = kgen.generateKey();
	            byte[] enCodeFormat = secretKey.getEncoded();
	            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
	            Cipher cipher = Cipher.getInstance("AES");
	            byte[] byteContent = content.getBytes("utf-8");
	            cipher.init(Cipher.ENCRYPT_MODE, key);
	            byte[] result = cipher.doFinal(byteContent);
	            return result;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 	/**����
	     * @param content  ����������
	     * @param password ������Կ
	     * @return
	     */
	    public static byte[] decrypt(byte[] content, String password) {
	        try {
	            KeyGenerator kgen = KeyGenerator.getInstance("AES");
	            kgen.init(128, new SecureRandom(password.getBytes()));
	            SecretKey secretKey = kgen.generateKey();
	            byte[] enCodeFormat = secretKey.getEncoded();
	            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
	            Cipher cipher = Cipher.getInstance("AES");
	            cipher.init(Cipher.DECRYPT_MODE, key);
	            byte[] result = cipher.doFinal(content);
	            return result;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	    
	    
	    public static void main(String[] args) throws UnsupportedEncodingException{
	       
	    	testStr();
	    }
	    
	    public static void testStr() throws UnsupportedEncodingException {
	    	String content = "������";
	        String password = "12345678";

	        System.out.println("����ǰ1��" + content);
	        byte[] encryptResult1 = encrypt(content, password); //��ͨ����
	        byte[] decryptResult1 = decrypt(encryptResult1,password);   //��ͨ����
	        System.out.println("���ܺ�1��" + new String(decryptResult1,"utf-8"));
	    }
}
