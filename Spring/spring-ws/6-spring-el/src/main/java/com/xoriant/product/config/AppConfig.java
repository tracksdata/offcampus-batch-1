package com.xoriant.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScans(value = {@ComponentScan("com.xoriant.product.model"),
		@ComponentScan("com.xoriant.product.service"),
		@ComponentScan("com.xoriant.product.dao")})

@PropertySource(value = "application.properties")
public class AppConfig {
	
}
