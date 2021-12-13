package com.xoriannt.employee.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.entity.Course;
import com.xoriannt.employee.entity.Student;

public class ManyToManyFetch {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

		Session ses = sessionFactory.openSession();

		Course course = ses.get(Course.class, 1);
		System.out.println(course.getCourseId());
		System.out.println(course.getCourseName());
		System.out.println(course.getPrice());
		System.out.println("---------------------------------");

		for (Student student : course.getStudents()) {
			System.out.println(student);
		}
		
		System.out.println("-----------------------------------");

		System.out.println(">>>>>> Done <<<<");

	}

}
