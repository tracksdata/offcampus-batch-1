package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Product prod=ac.getBean(Product.class);
		
		prod.setId(10);
		prod.setName("Pen");
		prod.setSalary(9349379);
		
		
		System.out.println(">>> Done <<<");

	}

}
