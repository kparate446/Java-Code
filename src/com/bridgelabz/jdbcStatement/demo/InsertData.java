package com.bridgelabz.jdbcStatement.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		String url = "jdbc:mysql://localhost:3306/college";
		String uname = "root";
		String password = "root";
		//		String query = "select * from Student where Sid=3";
		int Sid = 8;
		String Sname = "Varun";
		String Branch = "Electrical";
		int mark = 87;
//		String query = "insert into Student values (7,'Yash','Civil',90)";
		String query = "insert into Student values("+Sid+",'"+Sname+"','"+Branch+"',"+mark+")";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();//Prepared statement
		int count = st.executeUpdate(query);

		System.out.println(count+" row/s affected");
		
		st.close();
		con.close();
	}
}
