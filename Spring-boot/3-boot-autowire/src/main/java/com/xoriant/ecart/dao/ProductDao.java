package com.xoriant.ecart.dao;

import java.util.List;

import com.xoriant.ecart.model.Product;

public interface ProductDao {

	void save(Product product);

	void update(Product product);

	List<Product> findAll();

	Product findById(int id);

	void delete(int id);

}