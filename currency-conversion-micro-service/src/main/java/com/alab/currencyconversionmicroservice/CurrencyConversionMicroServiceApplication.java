package com.alab.currencyconversionmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.alab.currencyconversionmicroservice")
@EnableDiscoveryClient
public class CurrencyConversionMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionMicroServiceApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler() { // for sping cloud sleuth
		return Sampler.ALWAYS_SAMPLE;
	}
}
