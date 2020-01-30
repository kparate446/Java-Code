package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
public class MonthlyPayment {
	public static void main(String[] args) {
		System.out.println("Enter the Principle");
		int principle=Utility.inputNumber();
		System.out.println("Enter the Year");
		int year=Utility.inputNumber();
		System.out.println("Enter the Rate");
		int rate=Utility.inputNumber();
		int r=Utility.rateInterest(rate);
		int n=Utility.year(year);
		int payment=Utility.payment(principle, r, n);
		int interest=Utility.interest(payment, n, principle);
		System.out.println("Monthly payment"+payment);
		System.out.println("Interest"+interest);
	}
}
