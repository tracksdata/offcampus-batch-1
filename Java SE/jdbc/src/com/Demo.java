package com;

import java.sql.Connection;
import java.sql.DriverManager;

//import com.mysql.cj.jdbc.Driver;

public class Demo {
	
	/*
	 * 1. load driver class
	 * 2. establish connection
	 * 3. DB CRUD operation
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		try {
		/*
		 * 1. load driver class : 2 ways
		 * -------------------------------
		 * i. using registerDriver method
		 * ii. using Class.forName technique	
		 */
			
		//i. using registerDriver method
			
		 //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 //DriverManager.registerDriver(new Driver());
			
			
	     //ii. using Class.forName technique
		// Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println(">>>> Driver class is loaded....");
		 
		// 2. establish connection
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart","root","root1234");
		 System.out.println(">>> Connection established....");
			
			
		} catch (Exception e) {
			System.out.println("failed dur to "+e);
		}
		
		
		
		
	}

}
