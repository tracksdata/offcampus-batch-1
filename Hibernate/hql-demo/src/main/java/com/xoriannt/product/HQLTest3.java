package com.xoriannt.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xoriannt.product.config.HibConfig;
import com.xoriannt.product.entity.Course;

public class HQLTest3 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();

		Query<?> qry = ses.createQuery("select c.courseName,c.price from Course as c");
		List<?> results = qry.getResultList();

		for (int i = 0; i < results.size(); i++) {
			Object[] cols = (Object[]) results.get(i);

			for (Object col : cols) {
				System.out.println(col);
			}

		}

	}

}
