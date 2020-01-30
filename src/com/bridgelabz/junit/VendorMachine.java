package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
public class VendorMachine {
	public static void main(String[] args) {
		System.out.println("Enter the Amount");
		int Amount=Utility.inputNumber();
		Utility.vending(Amount);
	}
	
}
