package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,4154,5463,533,13,46,35};
		int n=arr.length;
//		Utility.bubble(arr,n);
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
