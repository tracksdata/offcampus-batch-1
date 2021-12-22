package com.xoriant.ecart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xoriant.ecart.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public void save(Product product) {
		System.out.println(">>> saving :: DAO");
	}

	@Override
	public void update(Product product) {

	}

	@Override
	public List<Product> findAll() {
		return null;
	}

	@Override
	public Product findById(int id) {
		return null;
	}

	@Override
	public void delete(int id) {

	}

}
