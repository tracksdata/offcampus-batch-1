package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {
	
	
	
	public static void main(String[] args) {
		
		 Connection con=null;
		try {

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		
		
		 String s1="insert into product values(?,?,?,?)";
		 PreparedStatement ps=con.prepareStatement(s1);
		 
		 ps.setInt(1, 18);
		 ps.setString(2, "Bottle");
		 ps.setDouble(3, 340.43);
		 ps.setString(4, "Water Bottle");
		 
		 int res=ps.executeUpdate();
		
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
