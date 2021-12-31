package com.xoriant.ecart.service;

import java.util.List;

import com.xoriant.ecart.entities.Product;

public interface ProductService {

	Product findById(int id);

	Product save(Product product);

	void deleteById(int id);

	void deleteProduct(Product product);

	List<Product> findByCategory_CatTitleEquals(String s1);

	List<Product> findByProductPriceGreaterThanEqual(double price);

	List<Product> findByProductPriceBetween(double start, double end);

	List<Product> findByProductTitleLike(String productTitle);

	List<Product> findByBrand_BrandTitleEquals(String brandTitle);

	List<Product> findByProductKeywordsLike(String keywords);

	List<Product> findAllProducts();

	List<Product> findProductsByBrandId(int brandId);

}