package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class PowerOfDemo {
	public static void main(String[] args) {
		//		System.out.println("Enter the Base");
		//		int base=Utility.inputNumber();
		int base=2;
		System.out.println("Enter the Exponential");
		int exp=0;
		try {
			exp=Utility.inputNumber();
		}catch(Exception e) {
			System.out.println("Exception:"+"Please Enter the Number");
		}
		int power=Utility.calculatePower(exp, base);
		System.out.println("2^"+exp+"="+power);
	}
}
