package com.xoriant.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.ecart.dao.BrandDao;
import com.xoriant.ecart.dao.CategoryDao;
import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.entities.Brand;
import com.xoriant.ecart.entities.Category;
import com.xoriant.ecart.service.ProductService;
import com.xoriant.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductDao productDao = ac.getBean(ProductDao.class);
		BrandDao brandDao = ac.getBean(BrandDao.class);
		ProductService ps = ac.getBean(ProductServiceImpl.class);
		
		// list all brands
		brandDao.findAll().forEach(System.out::println);
		System.out.println("===============================================");
		
		// list all categories
		CategoryDao categoryDao = ac.getBean(CategoryDao.class);
		categoryDao.findAll().forEach(System.out::println);
		System.out.println("===============================================");
		
		productDao.findByCategory_CatTitleEquals("Mobiles").forEach(System.out::println);
		System.out.println("===============================================");

		System.out.println("===============================================");
		System.out.println("===============================================");

		
		Category cat = categoryDao.findById(2).orElse(null);
		System.out.println(cat);
		for(Brand brand: cat.getBrands()) {
			System.out.println(brand);
		}
		
		ps.findProductsByBrandId(3).forEach(System.out::println);
		
	}

}
