package com.xoriant.productservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.productservice.model.Product;
import com.xoriant.productservice.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductServiceResource {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public List<?> findAllProducts() {
		return productService.findAllProducts();

	}
	
	@GetMapping("/{productId}")
	public Product findProductById(@PathVariable int productId) {
		return productService.findById(productId);
	}
	
	@GetMapping("/filter/price/{productId}")
	public double getPrice(@PathVariable int productId) {
		return productService.getPrice(productId);
	}
	
	
	

}
