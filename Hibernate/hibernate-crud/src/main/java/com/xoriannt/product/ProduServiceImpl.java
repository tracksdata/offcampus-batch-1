package com.xoriannt.product;

import com.xoriannt.product.entity.Product;

public class ProduServiceImpl {

	public static void display(Product prod) {

		System.out.println("Product ID: " + prod.getId());
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getDescription());
		System.out.println("--------------------------");

	}

}
