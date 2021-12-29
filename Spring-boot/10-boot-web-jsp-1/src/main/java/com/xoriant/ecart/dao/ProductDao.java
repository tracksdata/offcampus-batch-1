package com.xoriant.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.ecart.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	// DSL -> domain specific language
	
	// find all  products whose price greater than equals to 10,000
	
	List<Product> findByPriceGreaterThanEqual(double price);
	// find all products whose price between start and end
	List<Product> findByPriceBetween(double start,double end);
	// find all products whose name start with specified one
	List<Product> findByNameLike(String productName);
	// find all products whose name start with specified one and price range
	List<Product> findByNameLikeAndPriceBetween(String name,double start,double end);

	@Query(name = "q1",value = "from Product as p  where p.name like ?1 ")
	List<Product> findByName(String name);
	
	
	
	
}
