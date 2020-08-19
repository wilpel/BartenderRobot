package com.williampeltomaki.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class BartenderRobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(BartenderRobotApplication.class, args);
	}

}
