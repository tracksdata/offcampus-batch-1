package com.xoriant.productservice.service;

import java.util.List;

import com.xoriant.productservice.model.Product;

public interface ProductService {

	List<?> findAllProducts();

	public Product findById(int productId);
	
	public double getPrice(int productId);
}