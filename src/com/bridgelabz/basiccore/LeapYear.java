package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class LeapYear {
	public static void main(String[] args) {
		int year=0;
		boolean leap;
		System.out.println("Enter the Year");

		try {
			year=Utility.inputNumber();
		}catch(Exception e) {
			System.out.println("Exception:"+"Please Enter the Number");
		}
		leap=Utility.leapOrNotLeap(year);
		//System.out.println(leap);
		if(leap) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}
}
