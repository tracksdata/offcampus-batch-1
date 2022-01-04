package com.xoriant.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.xoriant.productservice.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private RestTemplate restTemplate = new RestTemplate();

	private final String PRODUCTS_BASEURL = "http://localhost:8082/api/search";
	private final String PRICE_BASEURL="http://localhost:8083/api/price";

	@Override
	public List<?> findAllProducts() {
		List<?> products = restTemplate.getForObject(PRODUCTS_BASEURL, List.class);
		return products;
	}
	
	public Product findById(int productId) {
		return restTemplate.getForObject(PRODUCTS_BASEURL+"/"+productId, Product.class);
		
	}
	
	public double getPrice(int productId) {
		return restTemplate.getForObject(PRICE_BASEURL+"/"+productId, Double.class);
	}

}
