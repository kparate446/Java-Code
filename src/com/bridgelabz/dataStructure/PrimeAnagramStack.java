package com.bridgelabz.dataStructure;
import java.util.Scanner;


import com.bridgelabz.utility.Utility;

public class PrimeAnagramStack
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int first=s.nextInt();
		System.out.println("Enter last number");
		int last=s.nextInt();
		System.out.println("The prime numbers between the given range are: ");
		Utility.primeandAnagram1(first,last);
	}
}


