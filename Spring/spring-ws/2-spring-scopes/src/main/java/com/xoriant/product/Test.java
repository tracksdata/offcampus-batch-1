package com.xoriant.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.product.config.AppConfig;
import com.xoriant.product.model.Product;

public class Test {

	public static void main(String[] args) {

		// 1. get Spring context object ::

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		 Product prod1 = ac.getBean(Product.class);
		// Product prod2 = ac.getBean(Product.class);

		// prod1.f1();
		// prod2.f1();

		System.out.println(">>> Done <<<");

	}

}
