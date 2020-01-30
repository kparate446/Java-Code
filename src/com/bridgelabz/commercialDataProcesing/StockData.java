package com.bridgelabz.commercialDataProcesing;
import java.util.Scanner;

//import org.graalvm.compiler.nodes.NodeView.Default;

public class StockData {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StockServiceimp serviceimp = new StockServiceimp();
		String arr = "";
		System.out.println("Select any Stock");
		System.out.println("Press 1 : Bharti Airtel \n Press 2 : Tata Motors \n Press 3 : yes Bank \n Press 4 : Axis Bank \n Press 5 : Atlanta");
		int key = sc.nextInt();

		switch(key) {
		case 1 : arr ="Bharti Airtel";
		break;
		
		case 2 : arr = "Tata Motors";
		break;
		
		case 3 : arr = "yes Bank";
		break;
		
		case 4 : arr= "Axis Bank";
		break;
		
		case 5: arr="Atlanta";
		break;
		
		default : System.out.println("Invalid key");
		break;
		}
		
		System.out.println("Enter the name ");
		String name=sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("Enter Share");
		long sharenum = sc.nextLong();
		
		System.out.println("Enter Price");
		long price = sc.nextLong();
		
		serviceimp.add(arr, name, sharenum, price);
		serviceimp.calculate();
		
		System.out.println("Remove Account");
		String delete = sc.nextLine();
		delete=sc.nextLine();
		serviceimp.remove(delete);
//		serviceimp.read();
		
	}
}
