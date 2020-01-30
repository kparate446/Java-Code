package com.bridgelabz.dataStructure;
import java.util.Stack;

import com.bridgelabz.utility.*;

public class BalancedParanthesis1 {

	public static void main(String[] args) {
		//			Utility utility = new Utility();
		System.out.println("Enter the Expression to check if balanced:");
		String input = Utility.inputString();
		char[] c = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='(') {
				stack.push(c[i]);
			}
			else if(c[i]==')') {
				stack.pop();
			}else if(c[i]=='{') {
				stack.push(c[i]);
			}else if(c[i]=='}') {
				stack.pop();
			}
			else if(c[i]=='[') {
				stack.push(c[i]);
			}
			else if(c[i]==']') {
				stack.pop();
			}
		}
		boolean b = stack.isEmpty();

		if(b) {
			System.out.println("Parentheses are Balanced");
		}
		else {
			System.out.println("Parentheses are Not Balanced");
		}
	}
}


