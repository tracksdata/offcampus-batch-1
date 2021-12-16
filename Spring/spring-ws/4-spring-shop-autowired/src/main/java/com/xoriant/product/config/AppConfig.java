package com.xoriant.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.xoriant.product.model,com.xoriant.product.service,com.xoriant.product.dao")
@ComponentScans(value = {@ComponentScan("com.xoriant.product.model"),
		@ComponentScan("com.xoriant.product.service"),
		@ComponentScan("com.xoriant.product.dao")})

public class AppConfig {
	
	

}
