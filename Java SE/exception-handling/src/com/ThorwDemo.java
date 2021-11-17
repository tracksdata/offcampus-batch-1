package com;

public class ThorwDemo {

	public static void main(String[] args) {

		try {

		   // int x = 10 / 0;
			int x=-10;
			if(x<0) {
				throw new Exception("Number must not be less than zero");
			}
				
			
			System.out.println("x: "+x);

			

		} catch (Exception e) {
			System.out.println("failed due to " + e);
		}

	}

}
