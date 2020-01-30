/**
 * Created by:- Krunal Parate
 * Date:-
 * Purpose:- Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.
 *
 */
package com.bridgelabz.dataStructure;
import java.util.Scanner;
import com.bridgelabz.utility.*;

class Transaction{
	int tokenNo;
	double amount;
	public Transaction(int tokenNo,double amount) {  //ConStructor
		this.tokenNo=tokenNo;this.amount=amount;
	}
}
public class BankCashCounter {
	class Node{
		Node next;
		Object data;
		public Node(Object data) {
			this.data=data;
		}
	}

	//Create new node
	Node head=new Node(100000.00);//Initial BankBalanced 
	public int add(Transaction data) {
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

	public static void main(String[] args) {
		BankCashCounter b=new BankCashCounter() ;
		//		LinkedList list=new LinkedList();// Error for add 
		int token=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true) {
			System.out.println("More people in Queue");
			System.out.println("\n press y if Yes or n if No");
			char c=sc.next().charAt(0);
			if(c=='n'||c=='N') 
				break;
			System.out.println("\n press 1 for deposit:\n press 2 for widraw");
			char ch1=sc.next().charAt(0);
			count++;

			if(ch1=='1') {
				token++;
				System.out.println("Enter Amount:");
				double amount=sc.nextDouble();
				Transaction t1=new Transaction(token, amount);//Deposit
				b.add(t1);
				b.dequeue();// People
			}
			else if(ch1=='2') {
				token++;
				System.out.println("Enter Amount");
				double amount=sc.nextDouble();
				Transaction t2=new Transaction(token, -(amount));//Withdraw
				b.add(t2);
			}
		}
		b.display();
		b.dequeue();
		System.out.println("Outstanding bank Balanced"+b.bankBalace());
		System.out.println(count +" People in deQueue");
	}

}	

