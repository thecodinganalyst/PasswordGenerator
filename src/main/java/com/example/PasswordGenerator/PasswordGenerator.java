package com.example.PasswordGenerator;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java -jar password-generator.jar <raw-password>");
			System.exit(1);
		}

		String rawPassword = args[0];

		// Use the same encoder Spring Security uses by default
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		String encoded = encoder.encode(rawPassword);

		System.out.println("Raw    : " + rawPassword);
		System.out.println("Encoded: " + encoded);
	}
}
