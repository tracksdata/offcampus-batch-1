package com.xoriant.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.ecart.dao.ProductDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
	
		ProductDao prodDao = ac .getBean(ProductDao.class);
	
		prodDao.findAllV4().forEach(System.out::println);
		
	}
	
	

}
