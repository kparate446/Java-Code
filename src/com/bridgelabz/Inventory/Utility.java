/** 
 * Created By:- Krunal Parate
 * Date :-
 */

package com.bridgelabz.Inventory;
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
	
	
	
	
}
