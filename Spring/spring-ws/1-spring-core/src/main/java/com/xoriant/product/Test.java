package com.xoriant.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.product.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		
		// 1. get Spring context object :: 
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		System.out.println(">> Done <<");
		

	}

}
