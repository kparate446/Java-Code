package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class Permutation {
	public static void main(String[] args) {
		String str="Krunal";
		int n=str.length();
		Utility.permute(str,0,n-1);
	}
	
}
