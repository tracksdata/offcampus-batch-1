package com.xoriannt.product;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Employee;
import com.xoriannt.product.entity.Product;

public class EmployeeUpdate {

	public static void main(String[] args) {
		
		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		
		// step2 : get / create session from session factory
		
		Session ses1 = sessionFactory.openSession(); // new session
		
		
		
		
	
		Employee emp = ses1.get(Employee.class, 4);
		Employee emp1 = ses1.get(Employee.class, 5);
		

		emp.setEmpName("Bucky Wall");
		emp.setSalary(945479);
		
		emp1.setEmpName("Ella bag");
		emp1.setSalary(31111);
		
		
		ses1.update(emp);
		ses1.update(emp1);
		
		ses1.close();
		ses1 = sessionFactory.openSession(); // new session
		
		ses1.beginTransaction().commit();
		
	    System.out.println(">>>> done <<<<");
		

	}

}
