package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.utils.DBConnection;

public class PreparedStatementDemo3 {
	
	
	
	public static void main(String[] args) {
		
		 Connection con=null;
		try {

		con= DBConnection.getConnection();
		
		
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
			DBConnection.closeConnection();
		}
		
		
		
		
	}

}
