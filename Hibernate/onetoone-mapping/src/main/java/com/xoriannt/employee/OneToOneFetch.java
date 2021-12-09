package com.xoriannt.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.config.HibernateConfig;
import com.xoriannt.employee.entity.Department;
import com.xoriannt.employee.entity.Employee;

public class OneToOneFetch {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

		Session ses = sessionFactory.openSession();

		Employee emp = ses.get(Employee.class, 1);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());
		System.out.println(emp.getDept().getDeptLoc());

		// System.out.println(emp);

		System.out.println(">>>> Done <<<<");

	}

}
