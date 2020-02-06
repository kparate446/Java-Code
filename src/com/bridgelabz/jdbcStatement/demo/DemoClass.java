package com.bridgelabz.jdbcStatement.demo;
import java.sql.*;
public class DemoClass {
	
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
		
		rs.next();
		String name = rs.getString("Sname");
		System.out.println(name);
		st.close();
		con.close();
	}
}
