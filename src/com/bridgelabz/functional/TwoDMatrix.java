package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class TwoDMatrix {
	
	public static void main(String[] args) {
		
		int arr1[][]=new int[10][10];
		double arr[][]=new double[10][10];
		System.out.println("Enter the Row");
		int row=Utility.inputNumber();
		System.out.println("Enter the Column");
		int column=Utility.inputNumber();
		System.out.println(row*column+"-Array Element");
		System.out.println("Choose the Array");
		System.out.println(" 1.Integer Array\n 2.Double Array\n 3.Boolean Array ");
		int n=Utility.inputNumber();
		
		switch(n){
		
		case 1:
			System.out.println("Enter the Number");
			Utility.intArray(arr1, row, column);
			break;
		case 2:
			System.out.println("Enter the Number");
			Utility.doubleArray(arr, row, column);
			break;
		case 3:
			System.out.println("Enter the Number");
			System.out.println(Utility.booleanArray(arr, row, column));
			break;
		default:
			System.out.println("Invalid Number");
		}
	}

}
