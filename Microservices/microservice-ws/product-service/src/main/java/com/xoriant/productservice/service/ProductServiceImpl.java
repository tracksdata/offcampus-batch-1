package com.xoriant.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.xoriant.productservice.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private RestTemplate restTemplate = new RestTemplate();

	private final String PRODUCTS_BASEUR = "http://localhost:8082/api/search";

	@Override
	public List<?> findAllProducts() {
		List<?> products = restTemplate.getForObject(PRODUCTS_BASEUR, List.class);
		return products;
	}
	
	public Product findById(int productId) {
		return restTemplate.getForObject(PRODUCTS_BASEUR+"/"+productId, Product.class);
		
	}

}
