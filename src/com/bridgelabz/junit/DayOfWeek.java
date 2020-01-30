package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
public class DayOfWeek {
	public static void main(String[] args) {
		int d=0,m=0,y=0;
		System.out.println("Enter the day-");
		d=Utility.inputNumber();
		System.out.println("Enter the month-");
		m=Utility.inputNumber();
		System.out.println("Enter the Year-");
		y=Utility.inputNumber();
		System.out.println("day-"+d+" Month-"+m+" year-"+y);
		int day=Utility.dayCalculator(d, m, y);
		switch(day) {
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thusday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		}
	}
}
