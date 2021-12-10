package com.xoriannt.employee.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xoriannt.employee.entity.AirlineInfo;
import com.xoriannt.employee.entity.Department;
import com.xoriannt.employee.entity.Employee;
import com.xoriannt.employee.entity.FlightInfo;

public class HibernateConfig {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			try {

				Configuration configuration = new Configuration(); // replacement of xml

				Properties settings = new Properties();

				// mandate properties
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/pss?useSSL=false");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root1234");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

				// Optional properties
				// settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				// settings.put(Environment.HBM2DDL_AUTO, "create");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.FORMAT_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				configuration.setProperties(settings);
				
				//configuration.addAnnotatedClass(Employee.class);
				//configuration.addAnnotatedClass(Department.class);
				configuration.addAnnotatedClass(AirlineInfo.class);
				configuration.addAnnotatedClass(FlightInfo.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return sessionFactory;
	}

}
