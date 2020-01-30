/*
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement: Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
 */
package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class WindChill {
	public static void main(String args[]) {
		//Double t=Double.parseDouble(args[0]);
		//Double v=Double.parseDouble(args[1]);
		System.out.println("Enter the temparature");
		Double t=Utility.inputDouble();
		System.out.println("Enter the wind");
		Double v=Utility.inputDouble();
		Double w=Utility.getWill(t, v);
		System.out.println("Temperature"+t);
		System.out.println("Speed of Wind"+v);
		System.out.println("WindChill"+w);
	}
}

