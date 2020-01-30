package com.bridgelabz.dataStructure;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class PrimeAnagram
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=s.nextInt();
//		int range=1000;
		int[] primeno=new int[range];
		primeno=Utility.PrimeNumber(range);
		int[] anagram = Utility.checkAnagram(primeno);
		Utility.twoDPrimeAnagram(anagram);
	}
	
}

