package com.bridgelabz.objectOrientedProgram.addressBook;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class AddressBook {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Operation operation = new Operation();
		PersonDetails ps =new PersonDetails();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		List<PersonDetails> list = ps.readFile();
		System.out.println("Details");

		// Show details

		for(PersonDetails pd : list) {
			System.out.println("Person name:"+ pd.getFname().toUpperCase()+", Last name:"+pd.getLname().toUpperCase()+", Address:"+pd.getAddress());
			System.out.println("City:"+pd.getCity()+", State:"+pd.getState()+", Zip:"+pd.getZip()+", Phone:"+pd.getPhone());
			System.out.println();
		}
		do {
//			System.out.println();
			System.out.println("1.Add Person Details \n2.Delete Person \n3.Show All Details \n4.Sort the Last Name \n5.Sort Zip \n6.Sort Address \n7.Edit Person \n8.Exit" );

			try {
				choice = sc.nextInt();
				switch(choice) {
				
				case 1:
					List<PersonDetails> read1 = ps.readFile(); //reading json file
					List<PersonDetails> list1 = operation.addPerson(read1); //method to add the person
					ps.writeFile(list1); //writing data in json file
					break;

				case 2 :
					List<PersonDetails> read2 = ps.readFile(); //reading json file
					List<PersonDetails> list2 = operation.removePerson(read2); //method to remove the person
					ps.writeFile(list2); //writing data in json file
					break;

				case 3 :
					List<PersonDetails> list3 = ps.readFile(); //reading json file 
					System.out.println("Details");
					for(PersonDetails pd : list3) {
						System.out.println("Person name:"+ pd.getFname().toUpperCase()+", Last name:"+pd.getLname().toUpperCase()+", Address:"+pd.getAddress());
						System.out.println("City:"+pd.getCity()+", State:"+pd.getState()+", Zip:"+pd.getZip()+", Phone:"+pd.getPhone());
						System.out.println();
					}
					break;
					
				case 4:
					List<PersonDetails> read4 = ps.readFile(); //reading json file
					List<PersonDetails> list4 = operation.sortLastName(read4); //method to sort the last name
//					ps.writeFile(list4); //writing data in json file
					System.out.println("sorted last name");
					for(PersonDetails pd : list4) {
						System.out.println("first name: "+ pd.getFname()+", lastname:"+pd.getLname());
					}
					break;
					
				case 5:
					List<PersonDetails> read5 = ps.readFile(); //reading json file
					List<PersonDetails> list5 = operation.sortzip(read5); //method to sort the last name
//					ps.writeFile(list4); //writing data in json file
					System.out.println("sorted zip");
					for(PersonDetails pd : list5) {
						System.out.println("first name: "+ pd.getFname()+", lastname:"+pd.getLname()+", Zip:" +pd.getZip());
					}
					break;
				
				case 6:
					List<PersonDetails> read6 = ps.readFile(); //reading json file
					List<PersonDetails> list6 = operation.sortAddress(read6); //method to sort the Address
//					ps.writeFile(list4); //writing data in json file
					System.out.println("sorted address ");
					for(PersonDetails pd : list6) {
						System.out.println("first name: "+ pd.getFname()+", lastname:"+pd.getLname()+", Address:" +pd.getAddress());
					}
					break;
					
				case 7:
					List<PersonDetails> read7 = ps.readFile(); //reading json file
					List<PersonDetails> list7 = operation.editPerson(read7); //method to add the person
					ps.writeFile(list7); //writing data in json file
					break;
				
				case 8:
					System.out.println("Thank You!");
					return;
					
				default:
					System.out.println("Enter correct choice!");

				}
			}catch (InputMismatchException e) {
				System.out.println("Please Enter integer Number only!");
				sc.next();
			}
		}while(choice!=10);
	}
}

//	