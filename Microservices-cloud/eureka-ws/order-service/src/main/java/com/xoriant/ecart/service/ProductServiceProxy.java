package com.xoriant.ecart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xoriant.ecart.entity.Product;

@FeignClient(name="search-service") // www.search-service:8081/10
public interface ProductServiceProxy {
	@GetMapping("/api/search/{productId}")
	public Product findProduct(@PathVariable int productId);

}
