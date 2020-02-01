package com.bridgelabz.objectOrientedProgram.addressBook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//import com.sun.jmx.mbeanserver.Util;

public class Operation {
	Scanner sc = new Scanner(System.in);
	PersonDetails pd =new PersonDetails();

	/**Add the PersonDetails*/	
	public List<PersonDetails> addPerson(List<PersonDetails>listOfPerson){
		System.out.println("Enter the First name");
		pd.setFname(Utility.stringInput());

		System.out.println("Enter the Last name");
		pd.setLname(Utility.stringInput());

		System.out.println("Enter the Address");
		pd.setAddress(Utility.stringInput());

		System.out.println("Enter the City");
		pd.setCity(Utility.stringInput());

		System.out.println("Enter the State");
		pd.setState(Utility.stringInput());

		System.out.println("Enter the zip");
		pd.setZip(Utility.longInput());

		System.out.println("Enter the Phone Number");
		pd.setPhone(Utility.longInput());
		int choice=0;
		System.out.println("1.Submit \t 2.Exit");
		choice = Utility.integerInput();
		switch (choice) {
		case 1:
			listOfPerson.add(pd);
			break;
		case 2:
			return listOfPerson ;
		default:
			break;
		}
//		listOfPerson.add(pd);
		System.out.println("Person Added Successfully");
		return listOfPerson;
	}

	/** Remove person
	 * @param firstName */
	public List<PersonDetails> removePerson(List<PersonDetails> list) { //method to remove stock from file
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getFname()); //showing all data by name
		}

		System.out.println("Enter name of person to remove: ");
		String nameOfPerson=Utility.stringInput();
//		nameOfPerson = Utility.stringInput();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFname().equalsIgnoreCase(nameOfPerson)) { //matching user input in list

				list.remove(i);
				System.out.println("Remove Person Details!");
				break;
			}
		}
		return list;
	}
	
	//Remove Of Person In Edit Function
	public List<PersonDetails> removePerson1(List<PersonDetails> list, String name) { //method to remove stock from file

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFname().equalsIgnoreCase(name)) { //matching user input in list

				list.remove(i);

				break;
			}
		}
		return list;
	}
	/*
	public  List<PersonDetails> DeletePerson(List<PersonDetails> list, String name) {
		boolean find = false;
		do {
			for(int i = 0;i<list.size();i++) {
				if(list.get(i).getFname().equals(name)) {//remove the found User
					find = true;
					//					System.out.println("Person details deleted Successfully");
					System.out.println("Edit the Person Details");
					break;
				}
			}
			if(!find) {
				System.out.println("not in list");
			}
			return list;
		}while(Utility.booleanInput());

		//		return list;

	}*/

	/** Edit User
	 * @throws IOException */
	public List<PersonDetails> editPerson(List<PersonDetails> list) throws IOException{
		int num = 0;
		int save = 0;
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getFname());
		}
		System.out.println("Enter name person want to Edit");
		String firstName = Utility.stringInput();//find person
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getFname().equals(firstName)) {
				PersonDetails temp = list.get(i);
//				DeletePerson(list, firstName);
				removePerson1(list,firstName);
				do {
					//perfoming editing operation
					System.out.println("1.last name\n2.address\n3.city\n4.state\n5.zip\n6.phone");
					System.out.println("Enter no of field you want to edit:");
					try {
						num=sc.nextInt();
						switch(num) {
						
						case 1:	
							System.out.println("Enter the last name");
							temp.setLname(Utility.stringInput());
							System.out.println("Details Save Successfully");
							break;

						case 2:
							System.out.println("Enter the Address");
							temp.setAddress(Utility.stringInput());
							System.out.println("Details Save Successfully");
							break;

						case 3:
							System.out.println("Enter the City");
							temp.setCity(Utility.stringInput());
							System.out.println("Details Save Successfully");
							break;

						case 4:
							System.out.println("Enter the State");
							temp.setState(Utility.stringInput());
							System.out.println("Details Save Successfully");
							break;

						case 5:
							System.out.println("Enter the Zip");
							temp.setZip(Utility.longInput());
							System.out.println("Details Save Successfully");
							break;

						case 6:
							System.out.println("Enter the phone");
							temp.setPhone(Utility.longInput());
							System.out.println("Details Save Successfully");
							break;
//						case 7:
////							System.out.println("Thank You!");
//							return list;
						default:
							System.out.println("Enter correct choice!");

						}	
					}catch(Exception e) {
						System.out.println("Enter the Valid Number");
						sc.hasNext();
					}
//				}while(num!=0);
//				do {
					//Save and Save As the details
					System.out.println("1.Save\n2.Save As");
					try {
						save = Utility.integerInput();
						switch(save) {
						case 1:
							int choice=0;
							System.out.println("1.Submit \t 2.Exit");
							choice = Utility.integerInput();
							switch (choice) {
							case 1:
								list.add(temp);
								break;
								
							case 2:
								return list ;
								
							default:
								break;
							}
//							list.add(temp);
							break;
						case 2:// if save as 
							System.out.println("Enter the new name of file: ");
							String name = Utility.stringInput();
							name = Utility.stringInput();
							String path="/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/AddressBook.json";
							File file = new File("path"+name+".json");
							file.createNewFile();
							FileWriter fw = new FileWriter(file);
							
							int choice1=0;
							System.out.println("1.Submit \t 2.Exit");
							choice1 = Utility.integerInput();
							switch (choice1) {
							case 1:
								list.add(temp);
								break;
								
							case 2:
								return list ;
								
							default:
								break;
							}
							
//							list.add(temp);
							for(PersonDetails pd : list) {
								fw.write(pd.getFname()+"\n"+pd.getLname()+"\n"+pd.getAddress()+"\n"+pd.getCity()+"\n"+pd.getState()+"\n"+pd.getZip()+"\n"+pd.getPhone()+"\n");
							}
							fw.flush();
							break;
						default:
							System.out.println("Enter correct choice!");

						}
					}catch(InputMismatchException e) {
						System.out.println("enter Integer only");
						sc.hasNext();
					}
					return list;
				}while(num!=10);
			}
		}
		return list;
	}

	/**Sorted Zip*/
	public List<PersonDetails>  sortzip(List<PersonDetails> listOfPerson){
		for(int i=0 ;i<listOfPerson.size();i++) {
			for(int j=0 ;j<listOfPerson.size();j++) {
				if(listOfPerson.get(i).getZip() <(listOfPerson.get(j).getZip())) {

					PersonDetails temp = listOfPerson.get(i);
					listOfPerson.set(i, listOfPerson.get(j));
					listOfPerson.set(j, temp);		
				}
			}
		}
		return listOfPerson;
	}

	/**Sorted Last Name*/
	public List<PersonDetails>  sortLastName(List<PersonDetails> listOfPerson){
		for(int i=0 ;i<listOfPerson.size();i++) {
			for(int j=0 ;j<listOfPerson.size();j++) {
				if(listOfPerson.get(i).getLname().compareTo(listOfPerson.get(j).getLname())<0) {

					PersonDetails temp = listOfPerson.get(i);
					listOfPerson.set(i, listOfPerson.get(j));
					listOfPerson.set(j, temp);		
				}
			}
		}
		return listOfPerson;
	}

	/**Sorted Address*/
	public List<PersonDetails>  sortAddress(List<PersonDetails> listOfPerson){
		for(int i=0 ;i<listOfPerson.size();i++) {
			for(int j=0 ;j<listOfPerson.size();j++) {
				if(listOfPerson.get(i).getAddress().compareTo(listOfPerson.get(j).getAddress())<0) {

					PersonDetails temp = listOfPerson.get(i);
					listOfPerson.set(i, listOfPerson.get(j));
					listOfPerson.set(j, temp);		
				}
			}
		}
		return listOfPerson;
	}
}
