package com.bridgelabz.algorithm;
//import com.bridgelabz.utility.Utility;
public class PrimeNumberRange {
	public static void main(String[] args) {
		int i,j;//n = 0;
		
//		try {
//		n=Utility.inputNumber();
//		}
//		catch(Exception e) {
//			System.out.println("please Enter the number "+e.getMessage());
//		}
//		for(i=0;i<=n;i++) {
		for(i=0;i<=1000;i++) {
			int c=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}
		
	}
}
