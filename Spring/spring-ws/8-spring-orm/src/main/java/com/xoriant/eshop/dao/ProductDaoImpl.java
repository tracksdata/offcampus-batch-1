package com.xoriant.eshop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xoriant.eshop.entity.Product;

@Repository
public class ProductDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	// save new product
	@Transactional
	public void save(Product prod) {
		Session ses = sessionFactory.getCurrentSession();
		ses.save(prod);
		//ses.beginTransaction().commit();
		System.out.println(">>> Product Saved...");
	}

	// fetch all data....
	@Transactional
	public List<?> findAll() {
		Session ses = sessionFactory.getCurrentSession();
		Query<?> qry = ses.createQuery("from Product");
		return qry.getResultList();

	}
	
	@Transactional
	public Product findById(int id) {
		Session ses = sessionFactory.getCurrentSession();
		Product prod = ses.get(Product.class, id);
		
		if(prod!=null) {
			return prod;
		}
		return null;
	}
	
	
	
	
	
	
	
	
	

}
