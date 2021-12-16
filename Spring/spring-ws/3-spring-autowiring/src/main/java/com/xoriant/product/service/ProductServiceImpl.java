package com.xoriant.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.product.dao.ProductDaopImpl;
import com.xoriant.product.model.Product;

@Service(value = "prodService")
public class ProductServiceImpl {

	@Autowired  // setter based autowire :: by type
	private ProductDaopImpl prodDao;

	//@Autowired // constructor based autowire :: by constructor
	public ProductServiceImpl(ProductDaopImpl prodDao) {
		this.prodDao = prodDao;
	}

	public void saveProduct(Product prod) {
		System.out.println(">>> ProductServiceImpl:: save");
		prodDao.saveProduct(prod); // call dao's save 
	}

}
