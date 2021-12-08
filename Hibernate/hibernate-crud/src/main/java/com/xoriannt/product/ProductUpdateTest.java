package com.xoriannt.product;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Employee;
import com.xoriannt.product.entity.Product;

public class ProductUpdateTest {

	public static void main(String[] args) {
		
		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		
		// step2 : get / create session from session factory
		
		Session ses1 = sessionFactory.openSession(); // new session
		
		
	
	  Product prod = ses1.get(Product.class, 170);
	  
	  // update prod
	  /*
	   * 1. update
	   * 2. merge 
	   * 3. saveOrUpdate
	   * 
	   */
	//Product prod=new Product();
	  // prod.setId(170);
	   prod.setName("Vila Wine Glass XXL");
	   prod.setDescription("Sony E8 Wireless1");
	   prod.setPrice(211);
	  
	  
	  ses1.update(prod);
	   Product obj1 = (Product)ses1.merge(prod);
	   //ses1.saveOrUpdate(prod);
	   
	   System.out.println(obj1);
	 
	 // commit objects in session
	 //Transaction tx=ses1.beginTransaction();
	 //tx.commit();
	
	 ses1.beginTransaction().commit();
	 
		
		
	     System.out.println(">>>> done <<<<");
		

	}

}
