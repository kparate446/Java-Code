/**
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement:Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 */
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class HarmonicNumber {
	public static void main(String args[]) {
//		HarmonicNumber sc=new HarmonicNumber();
		System.out.println("Enter the Number");
		int n=0;
		try {
		n=Utility.inputNumber();
		}catch(Exception e) {
			System.out.println("Exception:"+"Please Enter the Number");
		}
		double h= Utility.harmonic(n);
		System.out.println(h);
	}
}
