package com.xoriannt.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Customer;
import com.xoriannt.product.entity.Employee;

public class HibTest {

	public static void main(String[] args) {

		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();

		// step2 : get / create session from session factory

		Session ses1 = sessionFactory.openSession(); // new session

		Customer cust = new Customer(); // Transient state
		//cust.setCustId("CUST10001");
		cust.setCustName("James");
		cust.setAge(33);

		ses1.save(cust); // persistent state
		ses1.clear(); // detached state
		ses1.save(cust); // persistent state
		//ses1.detach(cust); // JPA
		//ses1.evict(cust); // Hibernate
		//ses1.save(cust);
		//ses1.close();
		
		
		
		
		System.out.println("Primary Key:: "+cust.getCustId());

		ses1.beginTransaction().commit();

		System.out.println(">>> Done <<<");

	}

}
