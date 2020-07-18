package com.alab.microservices.limitmicroservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-micro-service")
public class Configuration {
	private int minimum;
	private int maximum;
	
	public int getminimum() {
		return minimum;
	}
	public void setminimum(int minimum) {
		this.minimum = minimum;
	}
	public int getmaximum() {
		return maximum;
	}
	public void setmaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
	public Configuration() {
		
	}
	public Configuration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	
	
}
