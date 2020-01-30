package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
public class TempConversion {
	public static void main(String[] args) {
		double f,c;
		System.out.println("Choose type conversion \n 1.Fahrenheit to Celsius \n 2.Celsius to Fahrenheit");
		int ch=Utility.inputNumber();
		switch(ch) {
		case 1:System.out.println("Enter Fahrenheit temperature");
			f=Utility.inputDouble();
//			c=(f-32)*5/9;
			 c=Utility.fahrenheitToCelsius(f);
			System.out.println("Celsius temperature is"+c);
			break;
		case 2:System.out.println("Enter Celsius temperature");
			c=Utility.inputDouble();
			f=Utility.celsiusToFahrenheit(c);
			System.out.println("Fahrenheit temperature is"+f);
			break;
		default:System.out.println("Please choose valid choice");
		}
	}
}
