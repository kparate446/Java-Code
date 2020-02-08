package com.bridgelabz.jdbcStatement.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;

public class ServiceImpStatement {
	static DatabaseConnectivity connectivity = new DatabaseConnectivity();
	static Statement statement = null;
	static Connection con = DatabaseConnectivity.connect();
	static Student student = new Student();

	/** Show the data From Perticular Position*/
	public static Student PositionOfData(int Sid) throws Exception { // Perticular Position
		String query = "SELECT Sname,Branch,mark FROM Students WHERE Sid="+Sid;
		Student s = new Student();
		DatabaseConnectivity.connect();
		Statement st = con.createStatement();
		//query is a select query.
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		String branch = rs.getString(2);
		int mark = rs.getInt(3);
		s.Sname = name;s.Branch = branch;s.mark = mark;
		System.out.println(Sid+" : "+rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
		return s;
	}
	/**Insert the Student Data*/
	public void addStudent(int Sid, String Sname,String Branch ,int mark) { // Add Student
		String query = "insert into Students values("+Sid+",'"+Sname+"','"+Branch+"',"+mark+")";
		try {
			Statement st = con.createStatement();//Execute Query
			st.executeUpdate(query);//executes the query. It is used for create, drop, insert, update, delete etc
			System.out.println("Student Added");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/** Remove the Student Data*/
	public static void removeStudent(int Sid) {// Remove Student
		String query = "DELETE FROM Students WHERE Sid="+Sid;
		try {
			DatabaseConnectivity.connect();
			Statement st = con.createStatement();
			st.executeUpdate(query);//executes the query. It is used for create, drop, insert, update, delete etc
			System.out.println("Deleted the Student");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	/** Show Data the Student Data*/
	public static void showTable() throws SQLException {
		DatabaseConnectivity.connect();
		Statement st = con.createStatement();
		////query is a select query.
		ResultSet rs=st.executeQuery("SELECT * FROM Students");  
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}  
	}
	/** Update the Data*/
	public static Student updateTable(int id,int mark) throws SQLException {
		String query = "UPDATE Students SET mark="+mark+" WHERE Sid="+id ;

		try {
			DatabaseConnectivity.connect();
			Statement st = con.createStatement();
			st.executeUpdate(query);//executes the query. It is used for create, drop, insert, update, delete etc
			System.out.println("Student Data Update Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
		return student;
	}
	/** Create the Table*/
	public int createTable(String name) throws SQLException {
		//		DatabaseConnectivity.connect();
		//		String query = "CREATE TABLE Students"+"(Sid int primary key,"+"Sname varchar(50),"+"Branch varchar(20),"+"mark float)";
		//		String query = "CREATE TABLE Students (Sid int AUTO_INCREMENT PRIMARY KEY,Sname varchar(100),Branch varchar(50),mark float)";
		String query = "CREATE TABLE"+name+" (Sid int AUTO_INCREMENT PRIMARY KEY,Sname varchar(100),Branch varchar(50),mark float)";
		DatabaseConnectivity.connect();
		Statement st = con.createStatement();
		return st.executeUpdate(query);//executes the query. It is used for create, drop, insert, update, delete etc
	}
}
