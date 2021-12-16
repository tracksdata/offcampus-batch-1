package com.xoriant.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy(value = true)

public class ProductServiceImpl {
	
	public ProductServiceImpl() {
		System.out.println(">>> ProductServiceImpl obj created.. ");
	}

	
	
}
