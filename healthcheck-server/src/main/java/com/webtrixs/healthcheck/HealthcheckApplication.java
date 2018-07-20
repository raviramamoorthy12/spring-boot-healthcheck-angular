package com.webtrixs.healthcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication

public class HealthcheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcheckApplication.class, args);
	}
}
