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
			// The forName() method of Class class is used to register the driver class.
			Class.forName("com.mysql.jdbc.Driver");
			//The getConnection() method of DriverManager class is used to establish connection with the database.
			con = DriverManager.getConnection(url,uname,password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
