package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
public class Binary {
	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("Enter the number");
		int n=Utility.inputNumber();
		Utility.binaryNum(arr,n);
	}

}
