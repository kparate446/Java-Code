package com.bridgelabz.jdbcStatement.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DemoClass1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		String url = "jdbc:mysql://localhost:3306/college";
		String uname = "root";
		String password = "root";
		//		String query = "select * from Student where Sid=3";
		String query = "select * from Student";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);

		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));
			//		String name = rs.getString("Sname");
			//		System.out.println(name);
		}
		st.close();
		con.close();
	}
}

