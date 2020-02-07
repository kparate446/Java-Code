package com.bridgelabz.jdbcStatement.controller;

import java.util.Scanner;
import java.sql.*;
import com.bridgelabz.jdbcStatement.model.Student;
import com.bridgelabz.jdbcStatement.repository.DatabaseConnectivity;
import com.bridgelabz.jdbcStatement.services.ServiceImpStatement;
import com.bridgelabz.stock.Utility;

public class StatementMainStatement {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {

		//Scanner sc = new Scanner(System.in);
		Student student = new Student();
		DatabaseConnectivity connectivity = new DatabaseConnectivity();
		ServiceImpStatement impl = new ServiceImpStatement();
		int choice =0;
		//CRUD
		do {
			System.out.println();
			System.out.println("1. Insert data \n2. Position of data \n3. Show record \n4.delete value\n5.Update data\n6.Creating Table\n7.Exit");
			System.out.println("Enter your choice");
			choice = Utility.integerInput();
			switch (choice) {
			case 6:
				System.out.println("Creating table");
				//	if(impl.createTable()!=0) {
				//		System.out.println("Table Exist");
				//	}
				//	else {
				//		System.out.println("Table Created Successfully");
				//	}
				impl.createTable();
				break;

			case 1:
				impl.showTable();
				System.out.println("Insert Data for Student:-");
				System.out.println("Enter the Student id");
				int Sid = Utility.integerInput();
				System.out.println("Enter the Student Name");
				String studentName = Utility.stringInput();
				System.out.println("Enter the Branch");
				String branch=Utility.stringInput();
				System.out.println("Enter the marks");
				int marks=Utility.integerInput();
				//impl.addStudent(Sid, studentName, branch, marks);//adding data to list
				System.out.println("1.Submit \t 2.Exit");
				choice = Utility.integerInput();
				switch (choice) {
				case 1:
					impl.addStudent(Sid, studentName, branch, marks);//adding data to list
					break;
				case 2:
					return ;
				default:
					break;
				}
				break;
			case 2://
				impl.showTable();
				System.out.println("Which Position of data you want?");
				int num = Utility.integerInput();
				Student data = impl.PositionOfData(num);
				System.out.println(num+" : "+data.Sname+" : "+data.Branch+" : "+data.mark);
				break;
			case 3: 
				System.out.println("Show the Data");
				impl.showTable();
				break;
			case 4:
				impl.showTable();
				System.out.println("Remove the data by Student ");
				int Sid2 = Utility.integerInput();
				impl.removeStudent(Sid2);
				break;
			case 5:
				impl.showTable();
				System.out.println("Update Data for Student:-");
				System.out.println("Enter the Id");
				int Sid1 = Utility.integerInput();
				System.out.println("Enter Update the Mark");
				int mark1 = Utility.integerInput();
				System.out.println("1.Submit \t 2.Exit");
				choice = Utility.integerInput();
				switch (choice) {
				case 1:
					impl.updateTable(mark1,Sid1);
					impl.showTable();
					break;
				case 2:
					return ;
				default:
					break;
				}
			case 7:
				System.out.println("Thank You!");
				return;

			default:
				break;	
			}

		}while(choice!=10);
	}

}


