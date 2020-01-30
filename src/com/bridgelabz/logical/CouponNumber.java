package com.bridgelabz.logical;
import com.bridgelabz.utility.Utility;
public class CouponNumber {
	public static void main(String[] args) {
		System.out.println("Enter coupon Number");
		int n=Utility.inputNumber();
		int c=Utility.coupon(n);
		System.out.println("The number of random numbers generated to collect all distinct number is:"+c);
	}
}
