package com.bridgelabz.objectOrientedProgram.inventoryManagement;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utility {

	static Scanner sc = new Scanner(System.in);
	
	public int integerInput() {
		return sc.nextInt();
	}
	public static double doubleInput() {
		return sc.nextDouble();
	}

	public static String stringInput() {
		return sc.next();
	}

	public static Long longInput() {
		return sc.nextLong();
	}
	
	public static boolean booleanInput() {
		return sc.nextBoolean();	
	}
	
	public static float floatInput() {
		return sc.nextFloat();
	}
	
	public static String stringValidation(String string) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		if (!pattern.matcher(string).matches()) {
			throw new InputMismatchException();

		} else {
			return string;
		}
	}
	
	
}

