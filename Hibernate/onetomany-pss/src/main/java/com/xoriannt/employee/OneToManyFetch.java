package com.xoriannt.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.config.HibernateConfig;
import com.xoriannt.employee.entity.Department;
import com.xoriannt.employee.entity.Employee;

public class OneToManyFetch {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();
		
		
		Department dept = ses.get(Department.class, 1);
		System.out.println(dept.getDeptId());
		System.out.println(dept.getDeptName());
		System.out.println(dept.getDeptLoc());
		System.out.println("--------------------------");
		
		for(Employee emp:dept.getEmps()) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("_________________________");
		}
		
		
		
		
		
		
		System.out.println(">>>> Done <<<<");
		
		
		
		

		
		
		
	}

}
