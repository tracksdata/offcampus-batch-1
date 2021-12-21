package com.xoriant.ecart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = {@ComponentScan("com.xoriant.ecart.service"),
		@ComponentScan("com.xoriant.ecart.dao")})
public class AppConfig {
	
	

}
