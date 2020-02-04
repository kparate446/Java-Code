package com.bridgelabz.objectOrientedProgram.clinicManagement;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	// String Validation
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
	
    public static boolean isValid(String s) 
    { 
        // The given argument to compile() method  
        // is regular expression. With the help of  
        // regular expression we can validate mobile 
        // number.  
        // 1) Begins with 0 or 91 
        // 2) Then contains 7 or 8 or 9. 
        // 3) Then contains 9 digits 
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
  
        // Pattern class contains matcher() method 
        // to find matching between given number  
        // and regular expression 
        Matcher m = p.matcher(s); 
        return (m.find() && m.group().equals(s)); 
    } 
}
