package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringProjectApplication::main).with(TestSpringProjectApplication.class).run(args);
	}

}
