/** 
 * Cereated By:- Krunal Parate
 * Date :-
 * Purpose :- Inventory Management 
 */

package com.bridgelabz.objectOrientedProgram.Inventory;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InventoryManagement {

	public static void main(String[] args) throws IOException {
		Controller controller = new Controller();
		Operations operations = new Operations();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Inventory");
		List<Properties> read = null;

		// Read the File
		try {
			read = controller.readFile();
		} catch (Exception e1) {

			e1.printStackTrace();
		} //reading json file in list
		for (Properties pro : read) {
			System.out.println(pro.getType()+"-"+pro.getName() + " = " + pro.getWeight() * pro.getPrice());	//calculating the total prices of all inventories	
		}
		System.out.println();
		do {
			System.out.println("Operations");
			System.out.println("1.Add Inventory\n2.Remove Inventory\n3.Calculation of Inventory\n4.Total Inventory\n5.Add Type\n6.Remove Type \n7.Exit");
			System.out.println("Enter your choice");
			try {
				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						List<Properties> read1 = null;
						try {
							read1 = controller.readFile();
						} catch (Exception e) {

							e.printStackTrace();
						} // reading json file
						List<Properties> list1 = operations.addType(read1); //to add inventory 
						controller.writeFile(list1); 
						break;
					case 2:
						List<Properties> read2 = controller.readFile(); // reading json file
						List<Properties> list2 = operations.removeInventory(read2); // to remove inventory
						controller.writeFile(list2); 
						break;
					case 3:
						List<Properties> read3 = controller.readFile(); // reading json file
						operations.calculations(read3); 
						break;
						//Total Calulation Of Inventory
					case 4:
						List<Properties> read5 = null;
						try {
							read5 = controller.readFile();
						} catch (Exception e) {

							e.printStackTrace();
						} // reading json file
						List<Properties> list5 = operations.Totalcalculation(read5);; //to add inventory 
						controller.writeFile(list5); 
						break;

					case 5:
						List<Properties> read6 = controller.readFile(); // reading json file
						List<Properties> list6 = operations.addInventory(read6); // to remove inventory
						controller.writeFile(list6); 
						break;

					case 6:
						List<Properties> read7 = controller.readFile(); // reading json file
						List<Properties> list7 = operations.removeType(read7); // to remove inventory
						controller.writeFile(list7); 
						break;

					case 7:
						System.out.println("Thank you!");
						return;

					default:
						System.out.println("Invalid choice!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}catch (InputMismatchException e) {
				System.out.println("Enter valid input!");
				sc.next();
			}
		} while (choice != 4);
	}

}
