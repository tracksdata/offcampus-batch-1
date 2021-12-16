package com.xoriant.product.dao;

import org.springframework.stereotype.Repository;

import com.xoriant.product.model.Product;

@Repository
public class ProductDaopImpl {

	public void saveProduct(Product prod) {
		System.out.println(">>> ProductDaoImpl:: save");
		System.out.println(prod.getName() + " is saved to db...");
	}

}
