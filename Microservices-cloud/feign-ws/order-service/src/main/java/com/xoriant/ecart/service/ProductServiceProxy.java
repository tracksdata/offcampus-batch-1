package com.xoriant.ecart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xoriant.ecart.entity.Product;

@FeignClient(name="product-proxy",url = "http://localhost:8081/api/search")
public interface ProductServiceProxy {
	@GetMapping("/{productId}")
	public Product findProduct(@PathVariable int productId);

}
