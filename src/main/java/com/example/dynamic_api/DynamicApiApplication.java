package com.example.dynamic_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DynamicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicApiApplication.class, args);
	}

}
