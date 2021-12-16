package com.xoriant.product.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service // Business  logic 
//@Repository // Database logic / dao logic
//@Controller // web mvc controller
//@Configuration // classes having only configuration code
public class Product {

	public Product() {
		System.out.println(">>> Product Object created....");
	}

}
