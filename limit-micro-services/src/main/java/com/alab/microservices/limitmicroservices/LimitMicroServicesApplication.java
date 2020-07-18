package com.alab.microservices.limitmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LimitMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitMicroServicesApplication.class, args);
	}

}
