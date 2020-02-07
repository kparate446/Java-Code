package com.bridgelabz.jdbcStatement.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity  {
	static Connection con;
	static String url = "jdbc:mysql://localhost:3306/college";
	static String uname = "root";
	static String password = "root";
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
