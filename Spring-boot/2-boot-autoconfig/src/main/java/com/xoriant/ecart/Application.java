package com.xoriant.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		ps.save();
		
		
	}

}
