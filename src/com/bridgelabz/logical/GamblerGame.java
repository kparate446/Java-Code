package com.bridgelabz.logical;
import com.bridgelabz.utility.Utility;
public class GamblerGame {
	public static void main(String args[]) {
		System.out.println("Enter the Stack");
		int stack=Utility.inputNumber();
		System.out.println("Enter the Goal");
		int goal=Utility.inputNumber();
		System.out.println("Enter the number of time gambling");
		int Trial=Utility.inputNumber();
		int winCount=Utility.gambler(stack, goal, Trial);
		int lossCount = Trial - winCount;
		int winPercentage = Utility.winPerc(winCount,Trial);
		int lossPercentage = Utility.lossPerc(lossCount,Trial);
		// Display the Percentage
		System.out.println("Percentage of Wins : " +winPercentage);
		System.out.println("Percentage of Loss : " +lossPercentage);
	}
}
