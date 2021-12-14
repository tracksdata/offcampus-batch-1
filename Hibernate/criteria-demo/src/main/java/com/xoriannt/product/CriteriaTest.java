package com.xoriannt.product;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Course;
import com.xoriannt.product.entity.Student;

public class CriteriaTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();
		
		// Criteria API
		
		//Criteria cr= ses.createCriteria(Course.class);
		//List list = cr.list();
		//list.forEach(System.out::println);
		
		CriteriaBuilder cb = ses.getCriteriaBuilder();
		CriteriaQuery<Course> qry = cb.createQuery(Course.class);

		Root<Course> root = qry.from(Course.class);
		
		CriteriaQuery<Course> sq = qry.select(root);
		sq.where(cb.like(root.get("courseId"), "%p%"));
		
		sq.select(root);
		
		Query<Course> courses = ses.createQuery(qry);
		List<Course> courseData = courses.getResultList();
		
		
		for(Course c:courseData) {
			System.out.println(c);
			System.out.println("------------------");
			for(Student s:c.getStudents()) {
				System.out.println(s);
			}
			System.out.println("------------------");
		}
		
		
		
		
		
		
		
		
	}

}
