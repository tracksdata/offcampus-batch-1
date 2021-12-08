package com.xoriannt.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Employee;
import com.xoriannt.product.entity.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		
		// step2 : get / create session from session factory
		
		Session ses1 = sessionFactory.openSession(); // new session
		
		
		/*
		 * 
		 * Fetching data from table : 2-ways
		 * -----------------------------
		 * way-1 : fetch single row using primary key column
		 * way-2 : fetch multiple rows
		 * 
		 * way-1  : 2-ways
		 * -------
		 *  1. eager fetch
		 *  	-> get method
		 *  2. lazy fetch
		 *  	-> load method
		 */
		
		
		// using get method : eager loading
		
		
	    
		// Product prod = ses1.get(Product.class, 160);
		Product prod=ses1.load(Product.class, 16);
		ProduServiceImpl.display(prod);
		//System.out.println(prod.getName());
	     
	     //System.out.println(prod);
	    
		/*
		 System.out.println("Product ID: "+prod.getId());
	     System.out.println(prod.getName());
	     System.out.println(prod.getPrice());
	     System.out.println(prod.getDescription());
	     System.out.println("--------------------------");
	     
	     */
	     
		
	  // using load method : lazy loading
		
	     System.out.println(">>>> done <<<<");
		

	}

}
