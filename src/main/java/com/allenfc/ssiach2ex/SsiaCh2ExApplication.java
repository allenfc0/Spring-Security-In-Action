package com.allenfc.ssiach2ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.encrypt.BytesEncryptor;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.keygen.BytesKeyGenerator;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.security.crypto.keygen.StringKeyGenerator;

@SpringBootApplication
public class SsiaCh2ExApplication {

	public static void main(String[] args) {
		
		// String Version --------------------------------------------
//		StringKeyGenerator strGen = KeyGenerators.string();
//		String salt = strGen.generateKey();
//		
//		System.out.println(salt);
//		
		// Byte Version --------------------------------------------
//		BytesKeyGenerator bytesGen = KeyGenerators.secureRandom(16);
//		byte [] key = bytesGen.generateKey();
//		int keyLength = bytesGen.getKeyLength();
//		
//		System.out.println(key);
//		System.out.println(keyLength);
		
		
//		String salt = KeyGenerators.string().generateKey();
//		String password = "secret";
//		String valueToEncrypt = "HELLO";
//		
//		BytesEncryptor e = Encryptors.standard(password, salt);
//		byte [] encrypted = e.encrypt(valueToEncrypt.getBytes());
//		byte [] decrypted = e.decrypt(encrypted);
		
//		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
//		String pass = "12345";
//		String encodedPass = enc.encode(pass);
//		System.out.println(encodedPass);
		
		// Start to Spring boot application
		SpringApplication.run(SsiaCh2ExApplication.class, args);
	}

}
