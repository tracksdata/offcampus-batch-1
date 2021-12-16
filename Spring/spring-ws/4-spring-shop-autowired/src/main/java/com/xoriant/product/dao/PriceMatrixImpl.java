package com.xoriant.product.dao;

import org.springframework.stereotype.Repository;

//dependency
@Repository
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object created...");
	}
	
	/*
	 * 
	 *  Types of Objects
	 *  --------------------
	 *  1. dependency : never depends on any other objects 
	 *  2. dependent : always depends on dependency objects
	 * 
	 * 
	 */

	public double getItemPrice(String itemCode) {
		// code to fetch price of given item code from database.
		return 100.00;
	}
}
