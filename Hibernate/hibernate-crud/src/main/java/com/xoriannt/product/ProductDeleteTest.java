package com.xoriannt.product;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Employee;
import com.xoriannt.product.entity.Product;

public class ProductDeleteTest {
	
	
	/*
	 * 1. save
	 * 2. saveOrUpdate
	 * 3. update
	 * 4. merge
	 * 5. delete
	 * 6. evict
	 * 7. clear
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		
		// step2 : get / create session from session factory
		
		Session ses1 = sessionFactory.openSession(); // new session
		
		
	
	  Product prod = ses1.get(Product.class, 170);
	  
	  ses1.delete(prod);
	  ses1.beginTransaction().commit();
	
		
	     System.out.println(">>>> done <<<<");
		

	}

}
