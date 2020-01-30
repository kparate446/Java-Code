/*
  @ created by: Krunal Parate
  @ Date 10/01/2020
  @ Problem Statement: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 **/
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class StringReplace {
	public static void main(String[] args) {
		System.out.println("Enter Your name");
		String name=Utility.inputString();
		String n=name.substring(0,1).toUpperCase()+name.substring(1);
		int l=n.length();
		if(l>=3) {
			System.out.println("Hello "+n+" How are you");
		}
		else {
			System.out.println("Enter Minimum Three Digit Character");
		}
	}
}
//Replace String