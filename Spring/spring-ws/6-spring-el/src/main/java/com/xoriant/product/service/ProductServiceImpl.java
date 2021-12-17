package com.xoriant.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {
	
	@Value("${pname}")
	private String productName;
	
	@Autowired
	private Environment env;
	
	public void display() {
		System.out.println(">>>> Name: "+productName);
		System.out.println("Image Path:: "+env.getProperty("imagePath"));
	}
	
	
	
	
}
