package com.xoriant.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.product.config.AppConfig;
import com.xoriant.product.dao.ProductDaopImpl;
import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		//ProductServiceImpl ps = (ProductServiceImpl) ac.getBean("prodService");
		//ProductServiceImpl ps = ac.getBean("prodService",ProductServiceImpl.class);
		
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		Product p1 = new Product(10, "Pen", 76);
		//ProductDaopImpl prodDao = ac.getBean(ProductDaopImpl.class);
		//ps.setProdDao(prodDao); // DI
		ps.saveProduct(p1);

	}

}
