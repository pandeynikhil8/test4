package com.example.test4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.test4")
public class Test4Application {

	public static void main(String[] args) {
		SpringApplication.run(Test4Application.class, args);
	}

}
