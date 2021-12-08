package com.xoriannt.product.config;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class CustomPkGen implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		System.out.println(">>>> In CustomPkGen class <<<<<");
		/*
		QueryImplementor<?> qi = session.createQuery("select count(*) from Customer");
		List<?> size = qi.getResultList();
		
		Object x=size.get(0);
		System.out.println(x);
		
		if(x.equals("0")) {
			x=1;
		}
		
		*/
	
		long time=System.currentTimeMillis();
		
		return "ABC12"+time;
	}
	
	

}
