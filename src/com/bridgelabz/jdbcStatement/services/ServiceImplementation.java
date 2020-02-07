package com.bridgelabz.jdbcStatement.services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;

public class ServiceImplementation  {
	static DatabaseConnectivity connectivity = new DatabaseConnectivity();
	static Statement statement = null;
	static Connection con = DatabaseConnectivity.connect();
	static Student student = new Student();

	/** Show the data From Perticular Position*/
	public static Student PositionOfData(int Sid) throws Exception { // Perticular Position
		String query = "SELECT Sname,Branch,mark FROM Student WHERE Sid="+Sid;
		Student s = new Student();
		//		s.Sid=Sid;
		DatabaseConnectivity.connect();
				Statement st = con.createStatement();
//		PreparedStatement st=con.prepareStatement(query); 
		ResultSet rs = st.executeQuery(query);
		rs.next();
//		int id = rs.getInt(0);
		String name = rs.getString(1);
		String branch = rs.getString(2);
		int mark = rs.getInt(3);
		s.Sname = name;s.Branch = branch;s.mark = mark;
		return s;
	}

	/**Insert the Student Data*/
	public static void insertStudent(Student s) { // Add Student
		String query = "INSERT into Student Values (?,?,?,?)";
		PreparedStatement pst;
		try {
			DatabaseConnectivity.connect();
			pst = con.prepareStatement(query);
			pst.setInt(1, s.Sid);
			pst.setString(2, s.Sname);
			pst.setString(3, s.Branch);
			pst.setInt(4, s.mark);
			int count = pst.executeUpdate();
						System.out.println(count+" row/s affected"+pst);
			System.out.println("Student Added Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** Remove the Student Data*/
	public static void removeStudent(Student s) {// Remove Student
		String query = "DELETE FROM Student WHERE Sid=?";
		PreparedStatement pst;
		try {
			DatabaseConnectivity.connect();
			pst = con.prepareStatement(query);
			pst.setInt(1,s.Sid);
			pst.executeUpdate();
			System.out.println("Deleted the Student");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/** Show Data the Student Data*/
	public static void showTable() throws SQLException {
		DatabaseConnectivity.connect();
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM Student");  
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}  
	}

	/** Update the Data*/
	public static Student updateTable(int id,int mark) throws SQLException {
		String query = "UPDATE Student SET mark=? WHERE Sid=?" ;
		PreparedStatement pst;
		try {
			DatabaseConnectivity.connect();
			pst = con.prepareStatement(query);
			pst.setInt(1, mark);
			pst.setInt(2, id);
			int count = pst.executeUpdate();
			System.out.println("Student Data Update Successfully"+count);
		} catch (Exception e) {
			System.out.println(e);
		}
		return student;	
	}
	//	public static Student 

}
// Create Read Update  Delete

