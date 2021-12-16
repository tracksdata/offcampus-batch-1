package com.xoriant.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.xoriant.product.dao.PriceMatrixImpl;

// dependent
@Service
//@Scope("singleton")
@Scope("prototype")
public class BillerImpl {
	
	public BillerImpl() {
		System.out.println("Biller obj on "+this.hashCode()+" hashcode created ");
	}

	@Autowired
	private PriceMatrixImpl price; // Dependency class reference variable

	public double getCartTotal(String[] cart) {

		double total = 0.0;
		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}
		return total;
	}

	@Bean // single time invocation by spring application container obj...
	public void f1() {
		System.out.println(">>> BillerImpl f1 method by "+this.hashCode());
	}
	
	@Bean // single time invocation by spring application container obj...
	public void f2() {
		System.out.println(">>> BillerImpl f2 method by "+this.hashCode());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
