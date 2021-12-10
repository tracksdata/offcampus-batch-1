package com.xoriannt.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xoriannt.employee.config.HibernateConfig;
import com.xoriannt.employee.entity.AirlineInfo;
import com.xoriannt.employee.entity.FlightInfo;

public class FlightFetchTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session ses = sessionFactory.openSession();
		AirlineInfo airlineInfo = ses.get(AirlineInfo.class, 1);
		System.out.println(airlineInfo.getAirlineInfoId());
		System.out.println(airlineInfo.getAirlineName());
		System.out.println(airlineInfo.getAirlineLogo());
		System.out.println("----------------------------------------");
		for(FlightInfo fi: airlineInfo.getFlight_details()) {
			System.out.println(fi);
		}
	}

}
