package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection con=null;
	
	private DBConnection() {}
	
	public static Connection getConnection() {
		try {
		if(con==null) {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");
			return con;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public static void closeConnection() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
