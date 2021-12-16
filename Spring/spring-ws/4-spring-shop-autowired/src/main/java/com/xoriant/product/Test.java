package com.xoriant.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.product.config.AppConfig;
import com.xoriant.product.service.BillerImpl;

public class Test {

	public static void main(String[] args) {
		String[] cart1 = { "P01", "P02", "P03", "P04" };
		String[] cart2 = { "P01", "P02" };

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		BillerImpl biller = ac.getBean(BillerImpl.class);

		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total: " + total);
		
		biller.f1();
		biller.f2();
		
	}

}
