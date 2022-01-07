package com.xoriant.ecart.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="cart-proxy",url = "http://localhost:8083/api/cart")
public interface CartServiceProxy {

	@GetMapping("/{userId}")
	public List<?> getCartItems(@PathVariable int userId);

}
