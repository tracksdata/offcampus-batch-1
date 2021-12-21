package com.xoriant.ecart.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.xoriant.ecart.entity.Product;



@Configuration
@ComponentScans(value = { @ComponentScan("com.xoriant.ecart.service"), @ComponentScan("com.xoriant.ecart.dao") })
@PropertySource(value = "application.properties")
@EnableTransactionManagement
public class AppConfig {

	@Autowired
	private Environment environment;

	// step1 : define data-source information
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("db-driver"));
		dataSource.setUrl(environment.getProperty("db-url"));
		dataSource.setUsername(environment.getProperty("db-user"));
		dataSource.setPassword(environment.getProperty("db-password"));
		return dataSource;
	}

	// 2. Session Factory
	@Bean
	public LocalSessionFactoryBean getHibernateSession() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		Properties props = new Properties();
		props.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		props.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		props.put("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
		props.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		sessionFactory.setHibernateProperties(props);
		sessionFactory.setAnnotatedClasses(Product.class);
		// sessionFactory.setAnnotatedPackages("com.cts.product.entity");
		return sessionFactory;

		// sessionFactory.set

	}


	// 3. Transactions
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getHibernateSession().getObject());
		return transactionManager;
	}

}
