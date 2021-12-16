package com.xoriant.product.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy(value = true)
public class ProductDaopImpl {
	public ProductDaopImpl() {

		System.out.println(">>> ProductDaopImpl object created..");
	}
}
