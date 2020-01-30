package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class InsertionSort {
	public static void main(String[] args) {
		String a[]= {"krunal","vishal","ram","Bhushan"};
		String b[]=Utility.insertionSort(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}	
	}

}