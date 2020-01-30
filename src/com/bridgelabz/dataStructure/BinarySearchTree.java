/**
 * Created By :- Krunal Parate
 * Date:-
 * Purpose:- Binary Search Tree
 */
package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.*;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		//		Utility utility = new Utility();
		System.out.println("Enter the total number of testcases");
		double testCases = Utility.inputInteger();

		while (testCases > 0) {
			System.out.println("Enter total number of nodes");
			double totalNodes = Utility.inputInteger();
			double totalTree = Utility.numberOfBinarySearchTree(totalNodes);
			System.out.println(totalTree);
			testCases--;
		}
		System.out.println("Ends");
	}
}
