/** 
 * Created By:- Krunal Parate
 * Date :-
 * Purpose :- Write a Program to Stock Report 
 * 
 */

package com.bridgelabz.stock;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Operations operations = new Operations(); // Object of Operation Class
		Controller controller = new Controller(); //Object of Controller class
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		List<StockDetails> list = controller.readFile(); //reading json file 
		System.out.println("Details");
		//Show the Stock Details
		for(StockDetails sd : list) {
			System.out.println("Stock value of "+sd.getShareName().toUpperCase()+" ("+sd.getSymbol()+") "+" for 1 share is "+sd.getPrice());
			System.out.println("Total stock value of "+sd.getShareName().toUpperCase()+" for "+sd.getNoOfShare()+" shares is "+sd.getNoOfShare()*sd.getPrice());

		}
		do {
			//performing different operations by users choice
			System.out.println();
			System.out.println("1.Add stock \n2.Remove stock \n3.Add share \n4.Remove share\n5.Calculate total share\n6.Calculate total share in market \n7.Show All Details \n8.Exit \n Enter your choice: ");
			try {
				choice = sc.nextInt();
				switch(choice) {
				// Add Stock
				case 1:
					List<StockDetails> read1 = controller.readFile(); //reading json file
					List<StockDetails> list1 = operations.addStock(read1); //method to add new stock
					controller.writeFile(list1); //writing data in json file
					break;
					// Remove Stock
				case 2:
					List<StockDetails> read2 = controller.readFile(); //reading json file
					List<StockDetails> list2 = operations.removeStock(read2); //method to remove stock
					controller.writeFile(list2);	//writing data in json file
					break;
					// Add Share
				case 3:
					List<StockDetails> read8 = controller.readFile(); //reading json file
					List<StockDetails> list8 = operations.addShare(read8); //method to remove stock
					controller.writeFile(list8);	//writing data in json file
					break;
					// Removed Share
				case 4:
					List<StockDetails> read9 = controller.readFile(); //reading json file
					List<StockDetails> list9 = operations.removeShare(read9); //method to remove stock
					controller.writeFile(list9);	//writing data in json file
					break;
					// Total Share
				case 5:
					List<StockDetails> read3 = controller.readFile(); //reading json file
					operations.totalShare(read3); //method to calculate total shares
					break;
					// Total Market Share
				case 6:
					List<StockDetails> read4 = controller.readFile(); //reading json file
					operations.totalShareMarket(read4); //method to calculate total shares in market
					break;
					// Show All Details
				case 7 :
					List<StockDetails> list3 = controller.readFile(); //reading json file 
					System.out.println("Details");
					for(StockDetails sd1 : list3) {
						System.out.println("Stock value of "+sd1.getShareName().toUpperCase()+" ("+sd1.getSymbol()+") "+" for 1 share is "+sd1.getPrice());
						System.out.println("Total stock value of "+sd1.getShareName().toUpperCase()+" for "+sd1.getNoOfShare()+" shares is "+sd1.getNoOfShare()*sd1.getPrice());
						System.out.println();
					}
					break;
					// Exit
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
		}while(choice!=5);

	}

}
