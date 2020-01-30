
package com.bridgelabz.logical;
import com.bridgelabz.utility.Utility;
public class TicTacToeGame {
	
	public static void main(String[] args) {
		System.out.println("Enter choice:\n1 for start game \n2 for end game");
		//System.out.println(n);
		int ch=0;
		try {
			ch=Utility.inputNumber();
		}
		catch(Exception e) {
			
			System.out.println("Exception:"+"Please Enter the Number");
		}
		switch(ch) {
		case 1:
			Utility.print();
			Utility.user();
			Utility.print();
			break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Please enter the valid Number");
		}
	}
}
