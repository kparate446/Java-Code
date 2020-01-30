package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class StringAnagram {
	public static void main(String[] args) {
		String s1="Anagram";
		String s2="naramgA";
		boolean s=Utility.anagram(s1,s2);
		System.out.println(s);
	}
}
