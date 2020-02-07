package com.bridgelabz.jdbcStatement.demo;
import java.sql.*;

public class ShowDataPosition {
	public static void main(String[] args) throws Exception {
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(3);   
		System.out.println(s1.Sname);
	}
}
class StudentDao {
	public Student getStudent(int Sid) throws Exception {
		String query = "select Sname,Branch,mark from Student where Sid="+Sid;
		Student s = new Student();
		s.Sid=Sid;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
//		String name = rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getInt(3);
		s.Sname = name;
		return s;
	}
}
class Student{
	int Sid;
	String Sname;
}
