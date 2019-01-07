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
     * 加密
     * @param content 待加密内容
     * @param password  加密密钥
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
	 	/**解密
	     * @param content  待解密内容
	     * @param password 解密密钥
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
	    	String content = "哈哈哈";
	        String password = "12345678";

	        System.out.println("加密前1：" + content);
	        byte[] encryptResult1 = encrypt(content, password); //普通加密
	        byte[] decryptResult1 = decrypt(encryptResult1,password);   //普通解密
	        System.out.println("解密后1：" + new String(decryptResult1,"utf-8"));
	    }
}
