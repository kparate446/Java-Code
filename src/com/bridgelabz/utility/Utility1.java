package com.bridgelabz.utility;
import java.util.*;
//import com.bridgelabz.dataStructure.BalancedParathesis.Node;

import com.bridgelabz.dataStructure.BankCashCounter;


//import com.bridgelabz.dataStructure.BalancedParathesis.Node;

public class Utility1 {
	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public Node head;
	int count;
	public boolean addLast(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			System.out.println("Pushed" + n.data);
			System.out.println();
			count++;
			return true;
		}
		Node t = head;
		while (t.next != null) {
			t = t.next;
			count++;
		}
		t.next = n;
		System.out.println("Pushed:" + n.data);
		System.out.println();
		return true;
	}

	public boolean deleteLast(char bracket) {
		char pop = 0;
		int i;
		for( i=0 ;i <count;i++) {
			
		switch (bracket) {
		case ')':

			pop = '(';
			break;
//		case ']':
//			pop = '[';
//			break;
//
//		case '}':
//			pop = '{';
//			break;

		}
		System.out.println("To be popped:" + pop);
		Node t = head;
		if (t == null) {
			System.out.println("Stack Empty");
			return false;
		}
		if (t.next == null && (char) t.data == pop) {
			System.out.println("Popped" + t.data);
			head = null;
			return true;
		} else if (t.next == null && (char) t.data != pop) {
			return false;
		}
		while (t.next.next != null) {
			t = t.next;
		}
		if ((char) t.data == pop) {
			System.out.println("Popped" + t.data);
			t.next = null;
			return true;
		}
		}
		return false;
	}
	/********************************************************************************************/
	class Transaction{
		int tokenNo;
		double amount;
		public Transaction(int tokenNo,double amount) {
			this.tokenNo=tokenNo;this.amount=amount;
		}
	

		class Node{
			Node next;
			Object data;
			public Node(Object data) {
				this.data=data;
			}
		}
		Node head=new Node(100000.00);//Initial BankBalanced
		public int add(Transaction data) {
			Node n=new Node(data);
			if(head.next==null) {
				head.next=n;
				Transaction t1=(Transaction)n.data;
				if(t1.amount>0) {
					System.out.println("TokenNo "+t1.tokenNo +"Deposite Money "+t1.amount);
					System.out.println(head.data+"+"+t1.amount);
					double am=(double)head.data;
					am=am+t1.amount;
					head.data=am;
				}
				else {
					System.out.println("Token No "+t1.tokenNo+" -Withdraw Money "+(-1*t1.amount));
					System.out.println(head.data+" "+t1.amount);
					double am=(double)head.data;
					am=am+t1.amount;
					head.data=am;
				}

			}
			return 0;
			
		}
		double bankBalace() {
			return (Double)head.data;
		}
		void display() {
//			BankCashCounter b=new BankCashCounter();
			if(head.next==null)
				return;
			else {
				Node t=head.next;
				while(t!=null) {
					Transaction tr=(Transaction)t.data;
					if(t.next!=null)
						System.out.println("["+tr.tokenNo 
								+","+tr.amount+"]--->");
					else
						System.out.println("["+tr.tokenNo +","+tr.amount+"]\n");
					t=t.next;
				}
			}
		}
		boolean dequeue() {
			if(head.next==null) {
				System.out.println("No people in Queue");
				return false;
			}
			Node t=head.next;
			while(head.next!=null) {
				Transaction tran=(Transaction)head.next.data;
				System.out.println("Dequed"+tran.tokenNo);
				head.next=t.next;//removed
				t=head.next;
			}
			System.out.println("No people in Queue");
			return true;
		}
	}
	/*************************************************************************/
	
}
