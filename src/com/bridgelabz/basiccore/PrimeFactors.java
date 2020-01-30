/**
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement: Computes the prime factorization of N using brute force.
 */
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class PrimeFactors {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n=0;
		try {
			n=Utility.inputNumber();
		}catch(Exception e) {
			System.out.println("Exception:"+"Please Enter the Number");
		}
		
		int x=n;
		int k=Utility.primeFactors(x);
		System.out.println(k);
	}
}
