package com.example.StuInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StuInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuInfoApplication.class, args);
		System.out.println("Information of Students");
	}

}
