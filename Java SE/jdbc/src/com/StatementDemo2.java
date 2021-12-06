package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo2 {
	
	
	
	public static void main(String[] args) {
		
		 Connection con=null;
		try {

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		 System.out.println(">>> Connection established....");
		
		 Statement stmt=con.createStatement();
		 String s1="update product set name='Mac Book Pro',price=250000,description='Mac Book Pro 16-GB' where id=13";
		 
		 int res=stmt.executeUpdate(s1);
		 System.out.println(res+" statement(s) updated");		 
			
		} catch (Exception e) {
			System.out.println("failed dur to "+e);
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
