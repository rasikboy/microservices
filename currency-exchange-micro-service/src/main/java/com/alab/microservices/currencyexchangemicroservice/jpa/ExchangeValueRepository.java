package com.alab.microservices.currencyexchangemicroservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alab.microservices.currencyexchangemicroservice.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	// customer method called query method
	
	ExchangeValue findByFromAndTo(String from, String to);
	ExchangeValue findByFrom(String from);
	ExchangeValue findByTo(String to);

	
}
