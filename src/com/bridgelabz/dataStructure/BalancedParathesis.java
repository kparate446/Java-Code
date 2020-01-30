/**
  * Created By:- Krunal Parate
 * Date:-
 * Purpose:-Desc -> Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the performance of operations. Ensure parentheses must appear in a balanced fashion
 */

package com.bridgelabz.dataStructure;

import java.util.Scanner;
import com.bridgelabz.utility.*;

public class BalancedParathesis<T> {

	public static void main(String[] args) {
		
		Utility1 utility=new Utility1();//Object in next class
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression to check if balanced:");
		String exp = sc.nextLine();
		char re[] = exp.toCharArray();// String to Character converter
		for (int i = 0; i < re.length; i++) {
			if (re[i] == '(' )//|| re[i] == '[' || re[i] == '{')
				utility.addLast(re[i]);//Add 
			else if (re[i] == ')' ) {//|| re[i] == ']' || re[i] == '}') {
				char bracket = re[i];
				System.out.println("Found" + re[i]);
				boolean pop = utility.deleteLast(bracket);
				if (!pop) {
					System.out.println("Expression not balanced");
					return;
				}
			}
		}
		if (utility.head == null)
			System.out.println("Expression balanced with Paranthesis");
		else
			System.out.println("Expression Not balanced");
	}
}






//class Node {
//Object data;
//Node next;
//
//public Node(Object data) {
//	this.data = data;
//}
//}
//
//Node head;
//int count;
//public boolean addLast(Object obj) {
//Node n = new Node(obj);
//if (head == null) {
//	head = n;
//	System.out.println("Pushed" + n.data);
//	System.out.println();
//	count++;
//	return true;
//}
//Node t = head;
//while (t.next != null) {
//	t = t.next;
//	count++;
//}
//t.next = n;
//System.out.println("Pushed:" + n.data);
//System.out.println();
//return true;
//}
//
//public boolean deleteLast(char bracket) {
//char pop = 0;
//int i;
//for( i=0 ;i <count;i++) {
//	
//switch (bracket) {
//case ')':
//
//	pop = '(';
//	break;
////case ']':
////	pop = '[';
////	break;
////
////case '}':
////	pop = '{';
////	break;
//
//}
//System.out.println("To be popped:" + pop);
//Node t = head;
//if (t == null) {
//	System.out.println("Stack Empty");
//	return false;
//}
//if (t.next == null && (char) t.data == pop) {
//	System.out.println("Popped" + t.data);
//	head = null;
//	return true;
//} else if (t.next == null && (char) t.data != pop) {
//	return false;
//}
//while (t.next.next != null) {
//	t = t.next;
//}
//if ((char) t.data == pop) {
//	System.out.println("Popped" + t.data);
//	t.next = null;
//	return true;
//}
//}
//return false;
//}
