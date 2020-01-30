/**
 * Created By : Krunal Parate
 * Purpose:-A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam. We would like to construct an algorithm to input a string of characters and check whether it is a palindrome.
 * Date :- 
 */

package com.bridgelabz.dataStructure;
import com.bridgelabz.utility.*;
public class PalindromeChecker {  

	public static void main(String[] args) {  
//		PalindromeChecker sc = new PalindromeChecker();  
		Utility <Object> utility=new Utility<Object>();// next class object
		
		utility.addNode(1);  
		utility.addNode(1);  
		utility.addNode(1);  
		utility.addNode(2); 
		utility.addNode(1); 
		utility.display();   
		
		utility.isPalindrome();  
	}  
}  
