package com.alab.currencyconversionmicroservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alab.currencyconversionmicroservice.bean.CurrencyConversionBean;

//@FeignClient(name="currency-exchange-server", url="localhost:8000") 
//configuring this url in the  application.properties as we are using Ribbon to manage the Load of any the micro-service 
//currency-exchange-server.listOfServers=http://localhost
@FeignClient(name="currency-exchange-service")
//@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyEchangeServiceProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveValue(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
