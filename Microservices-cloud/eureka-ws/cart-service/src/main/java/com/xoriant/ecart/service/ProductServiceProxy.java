package com.xoriant.ecart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xoriant.ecart.model.Product;

@FeignClient(name = "search-service") // http://product-service:8081/api/search/11
public interface ProductServiceProxy {
	
	@GetMapping("/api/search/{productId}")
	public Product findProduct(@PathVariable int productId);
	

}
