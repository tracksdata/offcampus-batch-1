package com.xoriant.ecart.dao;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.xoriant.ecart.model.Product;

public interface ProductDao {

	// List all Products using queryForList method
	void findAllV1();

	List<Product> findAllV3();

	// List all Products using resultsetExtractor interface
	List<Product> findAllV4();

}