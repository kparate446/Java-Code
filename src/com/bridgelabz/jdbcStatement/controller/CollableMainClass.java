/**
 * Created By:- Krunal Parate
 * Date:-
 * Purpose:-Desc -> Collable Statement Using JDBC
 */
package com.bridgelabz.jdbcStatement.controller;
import java.util.Scanner;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;
import com.bridgelabz.jdbcStatement.services.ServiceImpCollable;
import com.bridgelabz.stock.Utility;

public class CollableMainClass {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		DatabaseConnectivity connectivity = new DatabaseConnectivity();
		ServiceImpCollable impl = new ServiceImpCollable();
		int choice =0;
		//CRUD
		do {
			System.out.println();
			System.out.println("1. Insert data \n2. Position of data \n3. Show record \n4. delete value\n5. Update data\n6. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				impl.showTable();
				System.out.println("Insert Data for Student:-");
				System.out.println("Enter the Student id");
				student.Sid = Utility.integerInput();
				System.out.println("Enter the Student Name");
				student.Sname = Utility.stringInput();
				//student.Sname = Utility.stringInput();
				System.out.println("Enter the Branch Of Student");
				student.Branch = Utility.stringInput();
				System.out.println("Enter the mark of Student");
				student.mark =Utility.integerInput(); 
				int num1=0;
				System.out.println("1.Submit \t 2.Exit");
				num1 = Utility.integerInput();
				switch (num1) {
				case 1:
					impl.insertStudent(student);//adding data to list
					break;
				case 2:
					break ;
				default:
					break;
				}
				break;
			case 2:
				impl.showTable();
				System.out.println("Which Position of data you want?");
				int num = Utility.integerInput();
				impl.PositionOfData(num);
				//System.out.println(num+" : "+data.Sname+" : "+data.Branch+" : "+data.mark);
				break;
			case 3: 
				System.out.println("Show the Data");
				impl.showTable();
				break;
			case 4:
				impl.showTable();
				System.out.println("Remove the data by Student ");
				int Sid1 = Utility.integerInput();
				impl.removeStudent(Sid1);
				break;
			case 5:
				impl.showTable();
				System.out.println("Update Data for Student:-");
				System.out.println("Enter the Id");
				int Sid = Utility.integerInput();
				System.out.println("Enter Update the Mark");
				int mark = Utility.integerInput();
				System.out.println("1.Submit \t 2.Exit");
				choice = Utility.integerInput();
				switch (choice) {
				case 1:
					impl.updateTable(Sid,mark);
					impl.showTable();
					break;
				case 2:
					break;
				default:
					break;
				}
				break;
			case 6:
				System.out.println("Thank You!");
				return;
			default:
				break;	
			}
		}while(choice!=10);
	}
}


