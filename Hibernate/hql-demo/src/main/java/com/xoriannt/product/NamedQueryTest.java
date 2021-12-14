package com.xoriannt.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Course;
import com.xoriannt.product.model.CourseInformation;

public class NamedQueryTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();

		Query<?> qry = ses.createNamedQuery("course_fetch");
		qry.setParameter(1, 6);
		
		List<?> courses = qry.getResultList();
		courses.forEach(System.out::println);
	
		
		
		
		

	}

}
