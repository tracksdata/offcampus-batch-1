package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetDemo {

	public static void main(String[] args) {

		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");

			String q1 = "select * from product";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(q1);

			while (rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("price"));
				System.out.println(rs.getString("description"));
				System.out.println("--------------------------");
			}
			

		} catch (Exception e) {
			System.out.println("failed dur to " + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
