package com.alab.microservices.currencyexchangemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeMicroServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() { // for sping cloud sleuth
		return Sampler.ALWAYS_SAMPLE;
	}
}
