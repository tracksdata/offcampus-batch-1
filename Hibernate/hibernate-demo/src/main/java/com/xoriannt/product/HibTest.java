package com.xoriannt.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Employee;

public class HibTest {

	public static void main(String[] args) {
		
		// step1 : get session factory
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		
		// step2 : get / create session from session factory
		
		Session ses1 = sessionFactory.openSession(); // new session
		
		
		
		Employee emp=new Employee();
		//emp.setEmpId(13);
		emp.setEmpName("Rose");
		emp.setSalary(4594);
		emp.setAge(38);
		
		// step3: save persistence objects into session
		
		ses1.save(emp);
		
		// step4: commit all objects in session

		ses1.beginTransaction().commit();
		
		
		System.out.println(">>> Done <<<");
		
		
		

	}

}
