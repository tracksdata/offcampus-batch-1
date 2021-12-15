package com;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P01", "P02", "P03", "P04" };
		String[] cart2 = { "P01", "P02" };
		
		
		//-----------------------------------------
		PriceMatrixImpl price=new PriceMatrixImpl(); // dependency
		//-----------------------------------------

		BillerImpl biller = new BillerImpl(); // dependent
		
		biller.setPrice(price); // passing dependency object (price) to the dependent object (biller) is called dependency injection : DI

		//==============================================
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total: " + total);
		//==============================================

	}

}
