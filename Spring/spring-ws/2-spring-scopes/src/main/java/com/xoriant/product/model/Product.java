package com.xoriant.product.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy(value = true)
public class Product {

	public Product() {
		System.out.println(">>> Product Object created on "+this.hashCode());
	}
	
	public void f1() {
		System.out.println(">>> Product class f1 method by "+this.hashCode());
	}

}
