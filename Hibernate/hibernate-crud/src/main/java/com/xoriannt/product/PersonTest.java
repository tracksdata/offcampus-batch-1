package com.xoriannt.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		
		Session ses=sessionFactory.openSession();
		
		Person p1=new Person("Praveen", 40, "10-10", "street1", "Hyderabad");
		Person p2=new Person("Praveen", 32, "10-11", "street2", "Pune");

		
		ses.save(p1);
		ses.save(p2);
		ses.beginTransaction().commit();
		
		System.out.println(">>>> done <<<<");
		
		
		

	}

}
