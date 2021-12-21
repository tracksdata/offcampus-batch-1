package com.xoriant.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.eshop.config.AppConfig;
import com.xoriant.eshop.dao.ProductDaoImpl;
import com.xoriant.eshop.entity.Product;

public class FetchProductTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
	
		//prodDao.findAll().forEach(System.out::println);
		
		//Product prod = prodDao.findById(12);
		//System.out.println(prod);
		
		Product prod=new Product();
		prod.setName("New-1");
		prod.setDescription("New Description-1");
		prod.setPrice(2323);
		
		prodDao.save(prod);
		
		
		
		
	}

}
