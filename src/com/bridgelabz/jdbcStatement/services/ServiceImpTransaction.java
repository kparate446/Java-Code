package com.bridgelabz.jdbcStatement.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;
import com.bridgelabz.stock.Utility;

public class ServiceImpTransaction  {
	static DatabaseConnectivity connectivity = new DatabaseConnectivity();
	static Statement statement = null;
	static Connection con = DatabaseConnectivity.connect();
	static Student student = new Student();

	/** Show the data From Perticular Position*/
	public static Student PositionOfData(int Sid) throws Exception { 
		String query = "SELECT Sname,Branch,mark FROM Students WHERE Sid=(?)";// Perticular Position of data
		Student s = new Student();
		// It Is used  in data Connectivity
		DatabaseConnectivity.connect();
		//The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.
		PreparedStatement cst=con.prepareStatement(query); 

		cst.setInt(1, Sid);///1 specifies the first parameter in the query  
		//The executeQuery() method of Statement interface is used to execute queries to the database. 
		ResultSet rs=cst.executeQuery();// ResultSet that can be used to get all the records of a table.
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}
		return student; 
	}
	/**Insert the Student Data
	 * @throws SQLException */
	public static void insertStudent(Student s) throws SQLException { // Add Student
		String query = "INSERT into Students Values (?,?,?,?)";
		PreparedStatement pst;
		//		try {
		// It Is used  in data Connectivity
		DatabaseConnectivity.connect();
		pst = con.prepareStatement(query);
		con.setAutoCommit(false);//	It is true bydefault means each transaction is committed bydefault.
		while(true) {
			pst.setInt(1, s.Sid);//1 specifies the first parameter in the query  
			pst.setString(2, s.Sname);//2 specifies the first parameter in the query  
			pst.setString(3, s.Branch);//3 specifies the first parameter in the query  
			pst.setInt(4, s.mark);//4 specifies the first parameter in the query  
			int count = pst.executeUpdate();//executes the query. It is used for create, drop, insert, update, delete etc.
			System.out.println("commit/rollback");
			String answer = Utility.stringInput();
			if(answer.equals("commit")) {
				con.commit();//commits the transaction.
				if(answer.equals("rollback")) {
					con.rollback();//cancels the transaction.
				}
				System.out.println("Want to add more records y/n");
				String ans = Utility.stringInput();
				if(ans.equals("n")) {
					break;
				}
			}
			con.commit();//commits the transaction.
			System.out.println("record successfully saved");
			con.close();// c
			//		} catch (Exception e) {
			//						System.out.println(e);

		}
	}
	/** Remove the Student Data*/
	public static void removeStudent(int Sid) {// Remove Student
		String query = "DELETE FROM Students WHERE Sid=?";
		PreparedStatement pst;
		try {
			// It Is used  in data Connectivity
			DatabaseConnectivity.connect();
			pst = con.prepareStatement(query);
			con.setAutoCommit(false);//
			while(true) {
				pst.setInt(1,Sid);
				pst.executeUpdate();//executes the query. It is used for create, drop, insert, update, delete etc.
				System.out.println("commit/rollback");
				String answer = Utility.stringInput();
				if(answer.equals("commit")) {
					con.commit();//commits the transaction.
					System.out.println("Deleted the Student");
				}
				if(answer.equals("rollback")) {
					con.rollback();
					System.out.println("No Student Record Deleted");
				}
				System.out.println("Want to add more records y/n");
				String ans = Utility.stringInput();
				if(ans.equals("n")) {
					break;
				}
			}
			con.commit();//commits the transaction.
			System.out.println("record successfully saved");
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	/** Show Data the Student Data*/
	public static void showTable() throws SQLException {
		// It Is used  in data Connectivity
		DatabaseConnectivity.connect();
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM Students");  
		ResultSet rs=stmt.executeQuery();  //The executeQuery() method of Statement interface is used to execute queries to the database.
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}  
	}
	/** Update the Data*/
	public static Student updateTable(int id,int mark) throws SQLException {
		String query = "UPDATE Students SET mark=? WHERE Sid=?" ;
		PreparedStatement pst;
		DatabaseConnectivity.connect();
		pst = con.prepareStatement(query);
		con.setAutoCommit(false);//
		while(true) {
			pst.setInt(1, mark);
			pst.setInt(2, id);
			int count = pst.executeUpdate();//executes the query. It is used for create, drop, insert, update, delete etc.
			System.out.println("commit/rollback");
			String answer = Utility.stringInput();
			if(answer.equals("commit")) {
				con.commit();//commits the transaction.
				System.out.println("Student Data Update Successfully");
			}
			if(answer.equals("rollback")) {
				con.rollback();
				System.out.println("Student Data Not Update Successfully");
			}
			System.out.println("Want to add more records y/n");
			String ans = Utility.stringInput();
			if(ans.equals("n")) {
				break;
			}
		}
		con.commit();//commits the transaction.
		System.out.println("record successfully saved");
		//			con.close();	
		//		} catch (Exception e) {
		//			System.out.println(e);
		//		}
		return student;	
	}
}
