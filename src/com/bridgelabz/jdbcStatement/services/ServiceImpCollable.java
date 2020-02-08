package com.bridgelabz.jdbcStatement.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;
import com.mysql.jdbc.CallableStatement;

public class ServiceImpCollable  {
	static DatabaseConnectivity connectivity = new DatabaseConnectivity();
	static Statement statement = null;
	static Connection con = DatabaseConnectivity.connect();
	static Student student = new Student();

	/** Show the data From Perticular Position*/
	public static void PositionOfData(int Sid) throws Exception { // Perticular Position
//		String query = "SELECT Sname,Branch,mark FROM Students WHERE Sid="+Sid;
		Student s = new Student();
		//		s.Sid=Sid;
		DatabaseConnectivity.connect();
//		Statement st = con.createStatement();
		CallableStatement cst = (CallableStatement) con.prepareCall("{call positionData(?)}"); 
		cst.setInt(1, Sid);
		ResultSet rs=cst.executeQuery();
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		} 
	}

	/**Insert the Student Data*/
	public static void insertStudent(Student s) { // Add Student
		//		String query = "INSERT into Students Values (?,?,?,?)";
		CallableStatement cst;
		try {
			DatabaseConnectivity.connect();
			cst = (CallableStatement) con.prepareCall("{call addStudent(?,?,?,?)}"); 
			cst.setInt(1, s.Sid);
			cst.setString(2, s.Sname);
			cst.setString(3, s.Branch);
			cst.setInt(4, s.mark);
			boolean count = cst.execute();
			System.out.println("Student Added Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** Remove the Student Data*/
	public static void removeStudent(int id) {// Remove Student
		//		String query = "DELETE FROM Students WHERE Sid=?";
		CallableStatement cst;
		try {
			DatabaseConnectivity.connect();
			cst = (CallableStatement) con.prepareCall("{call removeStudent(?)}");
			cst.setInt(1,id);
			cst.execute();
			System.out.println("Deleted the Student");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/** Show Data the Student Data*/
	public static void showTable() throws SQLException {
		DatabaseConnectivity.connect(); 
		CallableStatement cst = (CallableStatement) con.prepareCall("{call showTable()}"); 
		ResultSet rs=cst.executeQuery();  
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}  
	}

	/** Update the Data*/
	public static void updateTable(int Sid,int mark) throws SQLException {
		//		String query = "UPDATE Students SET mark=? WHERE Sid=?" ;
		CallableStatement cst;
		try {
			DatabaseConnectivity.connect();
			cst = (CallableStatement) con.prepareCall("{call updateTable(?,?)}"); 
			cst.setInt(1, mark);
			cst.setInt(2, Sid);
			boolean count = cst.execute();
			System.out.println("Student Data Update Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
// Create Read Update  Delete










//
//1 Insert data
/*CREATE DEFINER=`root`@`localhost` PROCEDURE `addStudent`(Sid int ,Sname varchar(100),Branch varchar(50),mark float)
BEGIN
	insert into Students values(Sid,Sname,Branch,mark);
END*/


//2 REmove data
/*CREATE DEFINER=`root`@`localhost` PROCEDURE `removeStudent`(Sid int)
BEGIN
DELETE FROM Students WHERE Sid=Sid;
END*/

//3 Upadte Student
/*CREATE DEFINER=`root`@`localhost` PROCEDURE `updateTable`( id int,mark int)
BEGIN
UPDATE Students SET mark=mark WHERE Sid=id;
END*/

//Show data
/*CREATE DEFINER=`root`@`localhost` PROCEDURE `showTable`()
BEGIN
SELECT * FROM Students;
END*/