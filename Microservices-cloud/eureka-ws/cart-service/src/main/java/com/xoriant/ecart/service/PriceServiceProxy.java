package com.xoriant.ecart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="price-proxy",url = "http://localhost:8082/api/price")
public interface PriceServiceProxy {
	
	@GetMapping("/{productId}")
	public double getPrice(@PathVariable int productId);

}
