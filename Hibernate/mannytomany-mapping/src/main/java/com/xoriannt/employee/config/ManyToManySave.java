package com.xoriannt.employee.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.entity.Course;
import com.xoriannt.employee.entity.Student;

public class ManyToManySave {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

		Session ses = sessionFactory.openSession();

		Course java = new Course("Java", 2500);
		Course php = new Course("Php", 1200);
		Course c = new Course("C", 500);
		Course cpp = new Course("CPP", 1000);

		Student s1 = new Student("Praveen", 8346384);
		Student s2 = new Student("James", 9348343);
		Student s3 = new Student("Kavya", 38644);
		Student s4 = new Student("Madhuri", 8336384);
		Student s5 = new Student("Pavani", 36454355);
		Student s6 = new Student("Priya", 36452455);
		Student s7 = new Student("Pankaj", 84574995);
		Student s8 = new Student("Deeraj", 45874555);
		Student s9 = new Student("Megana", 7397344);
		Student s10 = new Student("Puja", 583834783);

		java.getStudents().add(s1);
		java.getStudents().add(s2);
		java.getStudents().add(s3);
		java.getStudents().add(s4);

		cpp.getStudents().add(s1);
		cpp.getStudents().add(s5);
		cpp.getStudents().add(s6);
		cpp.getStudents().add(s7);

		c.getStudents().add(s8);
		c.getStudents().add(s9);
		c.getStudents().add(s1);

		php.getStudents().add(s1);
		php.getStudents().add(s2);
		php.getStudents().add(s3);
		php.getStudents().add(s4);
		php.getStudents().add(s5);
		php.getStudents().add(s6);
		php.getStudents().add(s7);
		php.getStudents().add(s8);
		php.getStudents().add(s9);
		php.getStudents().add(s10);
		
		
		s1.getCourses().add(java);
		s1.getCourses().add(cpp);
		s1.getCourses().add(c);
		s1.getCourses().add(php);
		

		s2.getCourses().add(php);
		s2.getCourses().add(java);

		s3.getCourses().add(php);
		s3.getCourses().add(java);
		
		s4.getCourses().add(php);
		s4.getCourses().add(java);
		
		s5.getCourses().add(cpp);
		s5.getCourses().add(php);
		
		s6.getCourses().add(php);
		s6.getCourses().add(cpp);
		
		s7.getCourses().add(cpp);
		s7.getCourses().add(php);
		
		s8.getCourses().add(php);
		s8.getCourses().add(c);
		
		s9.getCourses().add(c);
		s9.getCourses().add(php);


		s10.getCourses().add(php);


		/*
		ses.save(s1);
		ses.save(s2);
		ses.save(s3);
		ses.save(s4);
		ses.save(s5);
		ses.save(s6);
		ses.save(s7);
		ses.save(s8);
		ses.save(s9);
		ses.save(s10);
		
		*/
		

		ses.save(java);
		ses.save(cpp);
		ses.save(c);
		ses.save(php);

		ses.beginTransaction().commit();

		System.out.println(">>>>>> Done <<<<");

	}

}
