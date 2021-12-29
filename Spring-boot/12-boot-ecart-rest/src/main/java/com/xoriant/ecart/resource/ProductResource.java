package com.xoriant.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.ecart.entities.Brand;
import com.xoriant.ecart.service.BrandService;

@RestController
@RequestMapping("/api/brands")
public class ProductResource {
	
	/*
	 * requirements
	 * -------------------
	 *     GET
	 *     ---
	 * 1. List all Products
	 * 2. List all products by Brand Title
	 * 3. List all brands
	 * 4. List all categories
	 * 5. List all products by category name
	 * 6. List all products with in given price start and end range
	 * 7. List all products above given price range
	 * 8. List all orders of a given user id
	 * 
	 * -----------------------------------------------
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Autowired
	private BrandService brandService;
	
	// find all brands
	@GetMapping
	public List<Brand> findAllBrands(){
		return brandService.findAllBrands();
	}
	// find single brand using brand id
	@GetMapping("/{brandId}")
	public Brand findByBrandId(@PathVariable int brandId) {
		return brandService.findBrandById(brandId);
	}
	// find all brands by brand name
	@GetMapping("/filter/name/{brandName}")
	public List<Brand> findByBrandName(@PathVariable String brandName){
		return brandService.findByBrandName(brandName);
	}	

}
