package com.bridgelabz.deckofcards;
import java.util.Scanner;

public class DeckOfCards {
	static Scanner sc = new Scanner(System.in);
	Operation operation =new Operation();
	
	public static void main(String[] args) {
		System.out.println("Enter numbers of Players");
		Operation.players = sc.nextInt();
		System.out.println("Amount of card distribution"+Operation.players+"players");
		Operation.playcards = sc.nextInt();
		
		Operation.playerscards();
		Operation.showPlayerCard();
		
	}
}
