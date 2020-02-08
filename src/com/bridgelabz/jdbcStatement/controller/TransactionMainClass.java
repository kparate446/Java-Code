package com.bridgelabz.jdbcStatement.controller;
import java.util.Scanner;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;
import com.bridgelabz.jdbcStatement.services.ServiceImpTransaction;
import com.bridgelabz.stock.Utility;

public class TransactionMainClass {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		DatabaseConnectivity connectivity = new DatabaseConnectivity();
		ServiceImpTransaction impl = new ServiceImpTransaction();
		int choice =0;
		do {
			System.out.println();
			System.out.println("1. Insert data \n2. Position of data \n3. Show record \n4. delete value\n5. Update data\n6. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// Insert the Data
				impl.showTable();
				System.out.println("Insert Data for Student:-");
				System.out.println("Enter the Student id");
				student.Sid = Utility.integerInput();
				System.out.println("Enter the Student Name");
				student.Sname = Utility.stringInput();
				System.out.println("Enter the Branch Of Student");
				student.Branch = Utility.stringInput();
				System.out.println("Enter the mark of Student");
				student.mark =Utility.integerInput(); 
				impl.insertStudent(student);//adding data to list
				break;
			case 2:
				// Position Of data
				impl.showTable();
				System.out.println("Which Position of data you want?");
				int num = Utility.integerInput();
				impl.PositionOfData(num);
				break;
			case 3: 
				// Show The table
				System.out.println("Show the Data");
				impl.showTable();
				break;
			case 4:
				// Remove The Data
				impl.showTable();
				System.out.println("Remove the data by Student ");
				int Sid1 = Utility.integerInput();
				impl.removeStudent(Sid1);
				break;
			case 5:
				// Update the Data
				impl.showTable();
				System.out.println("Update Data for Student:-");
				System.out.println("Enter the Id");
				int Sid = Utility.integerInput();
				System.out.println("Enter Update the Mark");
				int mark = Utility.integerInput();
				impl.updateTable(Sid,mark);
				break;
			case 6:
				// Exit the Program
				System.out.println("Thank You!");
				return;

			default:
				break;	
			}
		}while(choice!=10);
	}
}

