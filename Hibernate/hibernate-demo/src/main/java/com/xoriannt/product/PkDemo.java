package com.xoriannt.product;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.CompositPkDemo;
import com.xoriannt.product.entity.Customer;
import com.xoriannt.product.entity.Employee;
import com.xoriannt.product.entity.Transaction;
import com.xoriannt.product.entity.User;

public class PkDemo {

	public static void main(String[] args) {

		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();

		// step2 : get / create session from session factory

		Session ses1 = sessionFactory.openSession(); // new session
		
		CompositPkDemo cpk1=new CompositPkDemo(1012, 10000);
		CompositPkDemo cpk2=new CompositPkDemo(1013, 10000);

		

		
		Transaction tx1=new Transaction();
		Transaction tx2=new Transaction();
		tx1.setDate(LocalDateTime.now());
		tx1.setPkDemo(cpk1);
		
		
		tx2.setDate(LocalDateTime.now());
		tx2.setPkDemo(cpk2);
		
		
		
		
		
		ses1.save(tx1);
		ses1.save(tx2);
		


		ses1.beginTransaction().commit();

		System.out.println(">>> Done <<<");

	}

}
