/** 
 * Cereated By:- Krunal Parate
 * Date :-
 */
package com.bridgelabz.objectOrientedProgram.Inventory;

import java.util.InputMismatchException;
import java.util.List;

import com.bridgelabz.objectOrientedProgram.stock.Utility;

public class Operations {
	Utility Utility =new Utility();

	/**Add Inventory*/
	@SuppressWarnings("static-access")
	public List<Properties> addInventory(List<Properties> list) { //method to add new inventory
		Properties properties = new Properties();
		try {
			//taking data from user
			System.out.println("Enter name of inventory: ");
			properties.setName(Utility.stringValidation(Utility.stringInput()));
			System.out.println("Enter weight of inventory: ");
			properties.setWeight(Utility.integerInput());
			System.out.println("Enter price of inventory: ");
			properties.setPrice(Utility.longInput());
		} catch (InputMismatchException e) {
			System.out.println("enter valid input!");
		}
		list.add(properties);	//adding data to list of inventory
		System.out.println("Inventory Added Successsfully!!");
		//		System.out.println("Inventory added successfully!!\nTo add more press 1\nTo exit press 0 ");
		//		int a = Utility.integerInput();
		//		if (a == 1)
		//			addInventory(list);
		return list;	//returning list of inventory data
	}

	/**Remove Inventory*/
	public List<Properties> removeType(List<Properties> list) {	//method to remove inventory data
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()); //showing available inventories
		}
		boolean find = false;
		System.out.println("Enter name of Type to be removed: ");
		try {
			@SuppressWarnings("static-access")
			String name = Utility.stringValidation(Utility.stringInput()); 
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equalsIgnoreCase(name)) { //matching user input with inventory list
					list.remove(i);	//removing found data
					find = true;
					System.out.println("Type removed!!");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		if (!find)
			System.out.println("Inventory not found!");

		return list;	//returning list of remaining inventories

	}

	/** Calculation*/
	public void calculations(List<Properties> list) {	//method to calculate price of inventory
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()); //showing all inventories
		}
		System.out.println("Enter name of inventory to calculate total: ");
		try {
			@SuppressWarnings("static-access")
			String inventoryName = Utility.stringValidation(Utility.stringInput());

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equalsIgnoreCase(inventoryName)) { //checking user input with the list of inventory
					float total = list.get(i).getWeight() * list.get(i).getPrice(); //calculating total price of inventory
					System.out.println("Total price is: " + total);

				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		//		System.out.println("To calculate more press 1\nTo exit press 0 ");
		//		int a = Utility.integerInput();
		//		if (a == 1)
		//			calculations(list);

	}

	/**Total Calculation*/
	public List<Properties> Totalcalculation(List<Properties> list) {
		float temp=0;
		for (int i = 0; i < list.size(); i++) {

			float total = list.get(i).getWeight() * list.get(i).getPrice(); //calculating total price of inventory

			temp=temp+total;
		}
		System.out.println("Total Inventory: "+temp);
		return list;
	}
	// Add the Type
	public List<Properties> addType(List<Properties> list) { //method to add new inventory
		Properties properties = new Properties();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getType()); //showing all inventories
		}
		System.out.println("Enter the type of Inventory ");
		try {
			@SuppressWarnings("static-access")
			String typeName = Utility.stringValidation(Utility.stringInput());

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getType().equalsIgnoreCase(typeName)) { 


					properties.setType(typeName);		
					//taking data from user
					System.out.println("Enter name of inventory: ");
					properties.setName(Utility.stringValidation(Utility.stringInput()));
					System.out.println("Enter weight of inventory: ");
					properties.setWeight(Utility.integerInput());
					System.out.println("Enter price of inventory: ");
					properties.setPrice(Utility.longInput());
				} 
			}
			list.add(properties);	//adding data to list of inventory
			System.out.println("Type Added Successsfully!!");
			return list;	//returning list of inventory data
		}catch (InputMismatchException e) {
			System.out.println("enter valid input!");
		}
		return list;
	}
	// Remove the Type
	public List<Properties> removeInventory(List<Properties> list) {	//method to remove inventory data
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getType()); //showing available inventories
		}
		boolean find = false;
		System.out.println("Enter name of Inventory to be removed: ");
		try {
			@SuppressWarnings("static-access")
			String name = Utility.stringValidation(Utility.stringInput()); 
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getType().equalsIgnoreCase(name)) { //matching user input with inventory list
					list.remove(i);	//removing found data
					find = true;
					System.out.println("Type removed!!");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		if (!find)
			System.out.println("Inventory not found!");

		return list;	//returning list of remaining inventories
	}
}