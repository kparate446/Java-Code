/** 
 * Created By:- Krunal Parate
 * Date :-
 */

package com.bridgelabz.objectOrientedProgram.Inventory;
import java.util.InputMismatchException;
import java.util.List;
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
	
}
