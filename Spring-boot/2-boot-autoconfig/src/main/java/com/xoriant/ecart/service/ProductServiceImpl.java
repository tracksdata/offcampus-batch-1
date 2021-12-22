package com.xoriant.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {

	@Value("${coupon_code}")
	private String code;
	
	@Autowired
	private Environment env;

	public void save() {
		System.out.println(">>> ProductServiceImpl save method...");
		System.out.println("Code:: " + code);
		System.out.println("Code: "+env.getProperty("coupon_code"));
	}

}
