/** 
 * Created By:- Krunal Parate
 * Date :-
 */
package com.bridgelabz.stock;

import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);
	
	public static int integerInput() {
		int a=0;
		try {
		 a=sc.nextInt();
		}catch (Exception e) {
			System.out.println("Please Enter the Number");
		}
		return a;
	}

	public static double doubleInput() {
		double b=0.0;
		try {
		 b=sc.nextDouble();
		}catch (Exception e) {
			System.out.println("Please Enter the Number");
		}
		return b;
		
	}

	public static String stringInput() {
		String c =null;
		try {
		c= sc.nextLine();
		}catch (Exception e) {
			System.out.println("Please Enter the String Value");
//			 sc.nextLine();
		}
		return c;
	}

	public static Long longInput() {
		Long d=null;
		try {
		d= sc.nextLong();
		}catch (Exception e) {
			System.out.println("Please Enter the Long Value");
		}
		return d;
	}

	public static boolean booleanInput() {
		return sc.nextBoolean();
	}
}