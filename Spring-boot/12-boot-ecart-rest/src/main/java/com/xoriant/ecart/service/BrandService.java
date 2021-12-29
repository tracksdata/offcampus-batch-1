package com.xoriant.ecart.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.ecart.entities.Brand;

public interface BrandService {

	// find all brands
	List<Brand> findAllBrands();

	// find by brand id
	Brand findBrandById(int brandId);

	// find all brands by brand name
	List<Brand> findByBrandName(String brandName);

}