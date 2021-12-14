package com.xoriannt.product;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Course;

public class HQLTest_Lazy {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		Session ses= sessionFactory.openSession();
		
		
		Query<?> qry=ses.createQuery("from Course");
		//Query<?> qry1=ses.createQuery("from Student");
		
		
		Iterator<?> courses = qry.iterate();
		
		while(courses.hasNext()) {
			Course c=(Course) courses.next();
			System.out.println(c);
			//System.out.println(courses.next());
		}
		
		
		//List<?> students = qry1.getResultList();

		
		//System.out.println(courses);
		
		//courses.forEach(System.out::println);
		//System.out.println("-------------------");
		//students.forEach(System.out::println);

		
		
		
		
		

	}

}
