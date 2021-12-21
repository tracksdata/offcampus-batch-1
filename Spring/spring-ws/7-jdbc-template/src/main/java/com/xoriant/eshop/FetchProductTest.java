package com.xoriant.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.eshop.config.AppConfig;
import com.xoriant.eshop.dao.ProductDaoImpl;

public class FetchProductTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
		//prodDao.findAllV1();
		
		//prodDao.findAllV2().forEach(System.out::println);
		prodDao.findAllV4().forEach(System.out::println);
		
	}

}
