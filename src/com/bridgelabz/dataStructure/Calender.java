/**Created by:- Krunal Parate
 * Date:-
 * Purpose:-Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week. Print the result as following.
 */
package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class Calender
{
	public static void main(String[] args)
	{
		System.out.println("Enter a month");
//		int m=Utility.inputInteger();
		int m=Integer.parseInt(args[0]);
		System.out.println(m);
		System.out.println("Enter a year");
//		int y=Utility.inputInteger();
		int y=Integer.parseInt(args[1]);
		System.out.println(y);
		Utility.dispCalender(m,y);
	}
	
}

