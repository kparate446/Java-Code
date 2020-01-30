package com.bridgelabz.inventory;

import java.util.Scanner;

public class InventoryData 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Inventoryserviceimp serv = new Inventoryserviceimp();
	String arr = "";
	System.out.println("Select one object");
	System.out.println("Press 1-> Rice");
	System.out.println("Press 2-> Wheat");
	System.out.println("Press 3-> Pulses");
	int key= sc.nextInt();
	switch(key)
	{
		case 1 : arr = "Rice";
		break;
		case 2 : arr = "Wheat";
		break;
		case 3 : arr = "pulses";
		break;
		default : System.out.println("invalid key");
		break;
	}
	System.out.println("enter name");
	String name = sc.nextLine();
	name = sc.nextLine();
	System.out.println("enter weight");
	
	long weight = sc.nextLong();
	System.out.println("enter price");
	long price = sc.nextLong();
	serv.add(arr, name, weight, price);
	serv.calculate();
	System.out.println("enter the name to remove");
	String delete = sc.nextLine();
	delete = sc.nextLine();
	serv.remove(delete);
	}

}