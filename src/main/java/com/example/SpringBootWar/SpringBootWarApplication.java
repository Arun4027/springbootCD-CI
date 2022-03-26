package com.example.SpringBootWar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWarApplication extends SpringBootServletInitializer{
//comment extends SpringBootServletInitializer needs to be added
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarApplication.class, args);
	}

}
