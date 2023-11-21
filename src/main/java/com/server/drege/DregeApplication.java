package com.server.drege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DregeApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DregeApplication.class, args);
		} catch (Exception exception) {
			Logger.log(exception.getMessage(), 'e');
		}
	}

}
