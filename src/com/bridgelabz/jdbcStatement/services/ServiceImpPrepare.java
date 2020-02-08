package com.bridgelabz.jdbcStatement.services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;

public class ServiceImpPrepare{
	static DatabaseConnectivity connectivity = new DatabaseConnectivity();
	static Statement statement = null;
	static Connection con = DatabaseConnectivity.connect();
	static Student student = new Student();
	/** Show the data From Perticular Position*/
	public static Student PositionOfData(int Sid) throws Exception { // Perticular Position
		String query = "SELECT Sname,Branch,mark FROM Students WHERE Sid=(?)";
		Student s = new Student();
		// It Is used  in data Connectivity
		DatabaseConnectivity.connect();
		//PreparedStatement Connection interface is used to return the object. 
		PreparedStatement cst=con.prepareStatement(query); 
		cst.setInt(1, Sid);//1 specifies the first parameter in the query
		//query is a select query.
		ResultSet rs=cst.executeQuery();
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}
		return student; 
	}
	/**Insert the Student Data*/
	public static void insertStudent(Student s) { // Add Student
		String query = "INSERT into Students Values (?,?,?,?)";
		PreparedStatement pst;
		try {
			// It Is used  in data Connectivity
			DatabaseConnectivity.connect();
			//PreparedStatement Connection interface is used to return the object. 
			pst = con.prepareStatement(query);
			pst.setInt(1, s.Sid);//1 specifies the first parameter in the query
			pst.setString(2, s.Sname);//2 specifies the first parameter in the query
			pst.setString(3, s.Branch);//3 specifies the first parameter in the query
			pst.setInt(4, s.mark);//4 specifies the first parameter in the query
			int count = pst.executeUpdate();//executes the query. It is used for create, drop, insert, update, delete etc
			System.out.println(count+" row/s affected"+pst);
			System.out.println("Student Added Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/** Remove the Student Data*/
	public static void removeStudent(Student s) {// Remove Student
		String query = "DELETE FROM Students WHERE Sid=?";
		PreparedStatement pst;
		try {
			// It Is used  in data Connectivity
			DatabaseConnectivity.connect();
			//PreparedStatement Connection interface is used to return the object. 
			pst = con.prepareStatement(query);
			pst.setInt(1,s.Sid);//1 specifies the first parameter in the query
			pst.executeUpdate();//executes the query. It is used for create, drop, insert, update, delete etc
			System.out.println("Deleted the Student");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	/** Show Data the Student Data*/
	public static void showTable() throws SQLException {
		// It Is used  in data Connectivity
		DatabaseConnectivity.connect();
		//PreparedStatement Connection interface is used to return the object. 
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM Students"); 
		////query is a select query.
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}  
	}
	/** Update the Data*/
	public static Student updateTable(int id,int mark) throws SQLException {
		String query = "UPDATE Students SET mark=? WHERE Sid=?" ;
		PreparedStatement pst;
		try {
			// It Is used  in data Connectivity
			DatabaseConnectivity.connect();
			//PreparedStatement Connection interface is used to return the object. 
			pst = con.prepareStatement(query);
			pst.setInt(1, mark);//1 specifies the first parameter in the query
			pst.setInt(2, id);//2 specifies the first parameter in the query
			int count = pst.executeUpdate();//executes the query. It is used for create, drop, insert, update, delete etc
			System.out.println("Student Data Update Successfully"+count);
		} catch (Exception e) {
			System.out.println(e);
		}
		return student;	
	}
}
// Create Read Update  Delete

