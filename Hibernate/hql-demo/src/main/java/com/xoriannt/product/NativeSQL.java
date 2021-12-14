package com.xoriannt.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Course;
import com.xoriannt.product.model.CourseInformation;

public class NativeSQL {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();

		String sqlQuery = " select c.courseId,c.courseName,c.price,s1.studentId,s2.phoneNumber,s2.studentName from Course c left outer join course_details s1 on c.courseId=s1.courseId left outer join Student s2 on s1.studentId=s2.studentId where c.courseId=1";
		Query<?> qry = ses.createNativeQuery(sqlQuery);
		List<?> results = qry.list();

		System.out.println(results);

		for (int i = 0; i < results.size(); i++) {

			Object[] cols = (Object[]) results.get(i);

			for (Object col : cols) {

				System.out.println(col);
			}
			
			System.out.println("--------------------------");

		}

	}

}
