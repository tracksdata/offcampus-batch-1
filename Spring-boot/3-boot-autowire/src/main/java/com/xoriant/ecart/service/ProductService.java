package com.xoriant.ecart.service;

import java.util.List;

import com.xoriant.ecart.model.Product;

public interface ProductService {

	void save(Product product);

	void update(Product product);

	List<Product> findAll();

	Product findById(int id);

	void delete(int id);

}
