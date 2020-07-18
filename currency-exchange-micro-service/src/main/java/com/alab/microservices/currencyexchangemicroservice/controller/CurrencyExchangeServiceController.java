package com.alab.microservices.currencyexchangemicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alab.microservices.currencyexchangemicroservice.ExchangeValue;
import com.alab.microservices.currencyexchangemicroservice.jpa.ExchangeValueRepository;

@RestController
public class CurrencyExchangeServiceController {

	@Autowired
	Environment environment;
	
	@Autowired
	ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveValue(@PathVariable String from, @PathVariable String to) {
		
		//ExchangeValue exchangeValue =new ExchangeValue("to","from",1000L,BigDecimal.valueOf(15));
		ExchangeValue exchangeValue =repository.findByFromAndTo(from, to);	
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchangeValue ;
	}
}
