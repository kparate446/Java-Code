package com.bridgelabz.objectOrientedProgram.addressBook;

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
			//			 sc.nextLine();
		}
		return c;
	}

	public static Long longInput() {
		Long d =null;
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

	//	public static boolean isValid(CharSequence long1) 
	//    { 
	//        // The given argument to compile() method  
	//        // is regular expression. With the help of  
	//        // regular expression we can validate mobile 
	//        // number.  
	//        // 1) Begins with 0 or 91 
	//        // 2) Then contains 7 or 8 or 9. 
	//        // 3) Then contains 9 digits 
	//        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	//  
	//        // Pattern class contains matcher() method 
	//        // to find matching between given number  
	//        // and regular expression 
	//        Matcher m = p.matcher(long1); 
	//        boolean k=(m.find() && m.group().equals(long1)); 
	////        return (m.find() && m.group().equals(long1)); 
	//		return k;
	//		
	//		
	//    }

	//	public static String isValid(String l) {
	////		      String phoneNumber = "9999999998";
	//		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	//		 Matcher m = p.matcher(l);
	////		      String regex = l;
	////		      System.out.println("The phone number is: " + l);
	//		      if(m.find() && m.group().equals(l)) {
	//		    	  return l;
	//		      }
	//		      else {
	//		    	  System.out.println("Please Enter the valid phone number");
	//		      }
	////		      boolean k=l.matches(regex);
	////		      System.out.println("Is the above phone number valid? " + l.matches(regex));
	//			return l;
	//		   }

	public static long isValid(Long long1) {
		int a[]=new int [10];
		try {
			for(int i=0;i<=a.length;i++) {
				if(a[i]==long1) {
					return long1;
				}
				else {
					System.out.println("Please Enter the 10 digit Number");
					isValid(long1);
				}
			}
			//		else {
			//			System.out.println("Enter 10 digit Mobile Number");
			//			isValid(long1);
			//			
			//		}

		}catch(Exception e) {
			System.out.println("Please Enter the 10 digit Number");
		}
		return long1;
	}
}

