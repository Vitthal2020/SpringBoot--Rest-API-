package com.example.Spring.Boot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.SpringBoot.Controller")
@EntityScan(basePackages = "com.example.SpringBoot.Book")
@EnableJpaRepositories(basePackages = "com.example.SpringBoot.Repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
