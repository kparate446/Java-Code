/** 
 * Created By:- Krunal Parate
 * Date :-
 */
package com.bridgelabz.stock;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utility {

	static Scanner sc = new Scanner(System.in);
	
	public static int integerInput() {
		int a = 0;
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
		c= sc.next();
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

	public static String stringValidation(String inputString) {
		String str=("^[a-zA-Z]*$");
		Pattern pr = java.util.regex.Pattern.compile(str);
		if(pr.matcher(inputString).matches()) {
			return inputString;
		}
		else {
			throw new InputMismatchException();
		}
	}
}