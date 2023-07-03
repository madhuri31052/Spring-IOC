package com.example.inversion_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {
		
		// Spring Bean Container    
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);     // To use MobilesConfig
		
		Mobiles obj = context.getBean("getOnePlusObject", Mobiles.class);       // To use the bean from MobilesConfig
		obj.getModelAndColor();                                                 // To get inside bean
	} 

}