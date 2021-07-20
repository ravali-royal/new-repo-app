package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public String encodePwd(String password) {
		
		Encoder encoder = Base64.getEncoder();
		byte[] bytes = password.getBytes();
		String encodedpwd = encoder.encodeToString(bytes);
		return encodedpwd;
	}
	public String decode(String encryptedTxt ) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encryptedTxt);
		return new String(decode);
		
	}
	public static void main(String[] args) {
		PasswordService passwordService = new PasswordService();
		String encodePwd = passwordService.encodePwd("ravali");
		System.out.println("Encode ::"+encodePwd);
		String decode = passwordService.decode(encodePwd);
		System.out.println("decode ::"+decode);
	}
}
