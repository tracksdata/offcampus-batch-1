package com.xoriannt.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.config.HibernateConfig;
import com.xoriannt.employee.entity.Department;
import com.xoriannt.employee.entity.Employee;

public class OneToOneSave {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();

		Department d1 = new Department("IT", "Chennai");
		Department d2 = new Department("Accounts", "Pune");
		Department d3 = new Department("HR", "Chennai");
		Department d4 = new Department("PAYROLL", "Hyderabad");
		Department d5 = new Department("ADMIN", "Klkata");

		Employee e1 = new Employee("Praveen", 823672348);
		Employee e2 = new Employee("James", 3475445);
		Employee e3 = new Employee("Kiran", 9347343);
		Employee e4 = new Employee("Ritam", 12458749);
		Employee e5 = new Employee("Paul", 5957449);

		e1.setDept(d1);
		e2.setDept(d1);
		e3.setDept(d1);
		e5.setDept(d2);
		e4.setDept(d4);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);
		
				

		ses.beginTransaction().commit();

		System.out.println(">>>> Done <<<<");

	}

}
