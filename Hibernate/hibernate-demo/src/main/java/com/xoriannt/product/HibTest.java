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

		Customer cust = new Customer();
		//cust.setCustId("CUST10001");
		cust.setCustName("James");
		cust.setAge(33);

		ses1.save(cust);
		
		System.out.println("Primary Key:: "+cust.getCustId());

		ses1.beginTransaction().commit();

		System.out.println(">>> Done <<<");

	}

}
