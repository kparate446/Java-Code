package com.bridgelabz.utility;

import com.bridgelabz.dataStructure.BankCashCounter;
//import com.bridgelabz.dataStructure.Transaction;
//import com.bridgelabz.dataStructure.BankCashCounter.Node;

public class LinkedList {
	class Transaction{
		int tokenNo;
		double amount;
		public Transaction(int tokenNo,double amount) {  //ConStructor
			this.tokenNo=tokenNo;this.amount=amount;
		}
	}
	class Node{
		Node next;
		Object data;
		public Node(Object data) {
			this.data=data;
		}
	}
	//Create new node
	Node head=new Node(100000.00);//Initial BankBalanced 
	
	public int add(int data) {
		Node n=new Node(data);
		if(head.next==null) {
			head.next=n;
			Transaction t1=(Transaction)n.data;//amount==data
			if(t1.amount>0) {
				System.out.println("TokenNo "+t1.tokenNo +"Deposite Money "+t1.amount);
				System.out.println(head.data+"+"+t1.amount);
				double am=(double)head.data;
				am=am+t1.amount;//am=100000+200
				head.data=am;//100200
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
	public double bankBalace() {
		return (Double)head.data;
	}
	public void display() {
		BankCashCounter b=new BankCashCounter();
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
	public boolean dequeue() {
		if(head.next==null) {
			System.out.println("No people in Queue");
			return false;
		}
		Node t=head.next;
		while(head.next!=null) {
			Transaction tran=(Transaction)head.next.data;
			System.out.println("Dequed "+tran.tokenNo);
			head.next=t.next;//removed
			t=head.next;
		}
		System.out.println("No people in Queue");
		return true;
	}
}
