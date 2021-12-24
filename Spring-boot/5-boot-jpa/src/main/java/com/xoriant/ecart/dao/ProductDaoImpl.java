package com.xoriant.ecart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xoriant.ecart.entity.Product;

@Repository
public class ProductDaoImpl {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public List<Product> findAll(){
		Query qry = em.createQuery("from Product");
		return qry.getResultList();	
	}
	
	
	public void save(Product product) {
		em.persist(product);
	}
	
	
	
	
	

}
