package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo2 {
	
	
	
	public static void main(String[] args) {
		
		 Connection con=null;
		try {

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		
		
		 String s1="update product set name=?,price=?,description=? where id=?";
		 PreparedStatement ps=con.prepareStatement(s1);
		 
		 ps.setInt(4, 18);
		 ps.setString(1, "Hot Water Bottle");
		 ps.setDouble(2, 1200);
		 ps.setString(3, "Tapperrware Water Bottle");
		 
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
