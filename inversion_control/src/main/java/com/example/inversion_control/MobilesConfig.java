package com.example.inversion_control;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilesConfig {
	
	// Bean is a reusable object
	
	@Bean
	public Color getColor() {
		return new Color();
	}
	
	@Bean 
	public Mobile getOnePlusObject(Color getColor) {
		return new OnePlus(getColor);
	}
	
	@Bean
	public Mobile getIPhoneObject() {
		return new IPhone();
	}
}
