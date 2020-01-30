package com.bridgelabz.dataStructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramQueue
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int first=s.nextInt();
//		int first=0;
		System.out.println("Enter the last number");
		int last=s.nextInt();
//		int last=1000;
		System.out.println("Prime Anagram in Queue number bet given range is: ");
		Utility.primeandAnagram(first,last);
	}
}
