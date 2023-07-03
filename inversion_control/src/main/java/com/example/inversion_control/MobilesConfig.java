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
	public Mobiles getOnePlusObject(Color getColor) {
		return new OnePlus(getColor);
	}
	
	@Bean
	public Mobiles getIPhoneObject() {
		return new IPhone();
	}
}
