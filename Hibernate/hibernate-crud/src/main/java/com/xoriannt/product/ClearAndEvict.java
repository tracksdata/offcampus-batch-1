package com.xoriannt.product;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Employee;
import com.xoriannt.product.entity.Product;

public class ClearAndEvict {
	
	
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
		Session ses2 = sessionFactory.openSession(); // new session
		
		
		Product prod1 = ses1.get(Product.class, 11);
		Product prod2 = ses1.get(Product.class, 12);
		Product prod3 = ses1.get(Product.class, 13);
		
		Employee emp = ses2.get(Employee.class, 3);
		
		//ses1.evict(prod2);
		//ses1.clear();
		
		prod2.setPrice(3333);
		
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		
		System.out.println(emp);
		
		ses1.update(prod2);
		
		ses1.beginTransaction().commit();
		
		
		
		
		
	
	  
	  
	 

	}

}
