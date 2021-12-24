package com.xoriant.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.ecart.dao.ProductDaoImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
		
		prodDao.findAll().forEach(System.out::println);
	
	}

}
