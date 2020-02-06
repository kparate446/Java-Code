package com.bridgelabz.jdbcStatement.demo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertdataintoPrepareStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		String url = "jdbc:mysql://localhost:3306/college";
		String uname = "root";
		String password = "root";
		//		String query = "select * from Student where Sid=3";
		int Sid = 9;
		String Sname = "Shreyas";
		String Branch = "Architecture";
		int mark = 51;
//		String query = "insert into Student values (7,'Yash','Civil',90)";
	/**	String query = "insert into Student values("+Sid+",'"+Sname+"','"+Branch+"',"+mark+")";*/
		String query = "insert into Student values (?,?,?,?)";//Prepared Statement
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		/**Statement st = con.createStatement();//Execute Query*/
		PreparedStatement st = con.prepareStatement(query);//Prepared statement
//		int count = st.executeUpdate(query);
		
		st.setInt(1,Sid);//Prepared statement
		st.setString(2, Sname);//Prepared statement
		st.setString(3, Branch);//Prepared statement
		st.setInt(4, mark);//Prepared statement
		int count = st.executeUpdate();
		System.out.println(count+" row/s affected");
		
		st.close();
		con.close();
	}
}
