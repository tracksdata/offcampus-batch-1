package com.xoriannt.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.config.HibernateConfig;
import com.xoriannt.employee.entity.Department;
import com.xoriannt.employee.entity.Employee;

public class OneToManySave {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();
		
		Department d1 = new Department("IT", "Chennai");
		Department d2 = new Department("Accounts", "Pune");
		

		Employee e1 = new Employee("Praveen", 823672348);
		Employee e2 = new Employee("James", 3475445);
		Employee e3 = new Employee("Kiran", 9347343);
		Employee e4 = new Employee("Ritam", 12458749);
		Employee e5 = new Employee("Paul", 5957449);
		
		
		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		d1.getEmps().add(e3);
		
		d2.getEmps().add(e4);
		d2.getEmps().add(e5);
		
		ses.save(d1);
		ses.save(d2);
		
		ses.beginTransaction().commit();
		System.out.println(">>>> Done <<<<");
		
		
		
		

		
		
		
	}

}
