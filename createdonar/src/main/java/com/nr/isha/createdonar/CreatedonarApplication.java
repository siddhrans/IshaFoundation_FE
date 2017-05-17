package com.nr.isha.createdonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

 
 

@SpringBootApplication
@EntityScan(basePackages="com.nr.isha.createdonar.model")
public class CreatedonarApplication {

	public static void main(String[] args) {
		System.out.println("CreatedonarApplication->before");
		SpringApplication.run(CreatedonarApplication.class, args);
		System.out.println("CreatedonarApplication->after");
	}
}
