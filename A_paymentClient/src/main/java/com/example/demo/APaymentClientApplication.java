package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@Component
public class APaymentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(APaymentClientApplication.class, args);
	}

}
