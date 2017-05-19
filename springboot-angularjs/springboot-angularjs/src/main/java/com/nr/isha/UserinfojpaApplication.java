package com.nr.isha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

 
@EnableAutoConfiguration
 @ComponentScan("com.nr")
@SpringBootApplication
public class UserinfojpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserinfojpaApplication.class, args);
	}
}
