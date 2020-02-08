package com.bridgelabz.jdbcStatement.demo;
import java.sql.*;
import java.util.Scanner;
public class ShowDataPositionAdd {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentData data = new StudentData();
	
		Student1 s1 = new Student1();
//		System.out.println("Select choice");
//		int key = sc.nextInt();
//		switch (key) {
//		case 1:
//			
//			break;
//
//		default:
//			break;
//		}
		data.connect();
		Student s2 = data.getStudent(3);  
		
	/*			s1.Sid = 9;//s2.nextInt();*/
				System.out.println(s2.Sname);
		//		s1.Sname = "Rutuja";//sc.nextLine();
		//		s1.Branch = "Electronics";//sc.nextLine();
		//		s1.mark = 100;//sc.nextInt();
		//	s1.Sid=9;//sc.nextInt();
		/**data.connect();*/
		//		data.addStudent(s1);
//		data.showTable();
		//	data.removeStudent(s1);
		
	}
}
class StudentData{
	Connection con ;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","root");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Student getStudent(int Sid) throws Exception { // Perticular Position
		String query = "select Sname,Branch,mark from Student where Sid="+Sid;
		Student s = new Student();
		s.Sid=Sid;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		//		String name = rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getInt(3);
		s.Sname = name;

		return s;
	}
	public void addStudent(Student1 s) { // Add Student
		String query = "insert into Student Values (?,?,?,?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);

			pst.setInt(1, s.Sid);
			pst.setString(2, s.Sname);
			pst.setString(3, s.Branch);
			pst.setInt(4, s.mark);

			int count = pst.executeUpdate();
			//			System.out.println(count+" row/s affected");
			System.out.println("Student Added");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public void removeStudent(Student1 s) {// Remove Student

		String query = "delete from Student where Sid=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1,s.Sid);
			pst.executeUpdate();
			System.out.println("Deleted the Student");

		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void showTable() throws SQLException {

		PreparedStatement stmt=con.prepareStatement("select * from Student");  
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));  
		}  
	}
	
	

}
class Student1{
	int Sid;
	String Sname;
	String Branch;
	int mark;
}
// CRUD