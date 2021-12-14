package com.xoriannt.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xoriannt.product.config.HibConfig;

public class HQLTest2 {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		Session ses= sessionFactory.openSession();
		
		
		Query<?> qry=ses.createQuery("select c.courseName from Course as c");
		
		List<?> results = qry.getResultList();
		
		results.forEach(System.out::println);
		
		
		
		
		
		

	}

}
