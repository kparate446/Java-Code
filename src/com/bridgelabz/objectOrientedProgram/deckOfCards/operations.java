package com.bridgelabz.objectOrientedProgram.deckOfCards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class operations {
	// different types of cards
	//	static String suit[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
	static String suit[] = { "♣","♦","♥","♠"};
	//	static String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10 ", "jack", "Queen", "King", "Ace" };
	static String rank[] = {"A","2", "3", "4", "5","6", "7", "8", "9", "10", "J","Q", "K"};
	// take input from users no. of players and distribute cards
	public static int players = 4;
	public static int playcards = 9;
	// total card are 52
	final static int totalcards = 52;
	// initialized desk with 52 cards
	static String carddesk[] = new String[52];
	// store alloted players cards in 2d array
	static String allotcards[][] = new String[playcards][players];
	public static List<Integer> check = new ArrayList<Integer>();

	// get all possibility's of total cards using rank and suit.
	public static void generateCardCombination() {
		int cnt = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				{
					carddesk[cnt] = suit[i] + " " + rank[j];
					cnt++;
				}
			}
		}
	}
	//***
	public static void playerscards() {
		allotcards = new String[playcards][players];
		if (totalcards >= (playcards * players)) { // check all players are card not greater the total cards
			generateCardCombination();
			for (int i = 0; i < playcards; i++) {
				int j = 0;
				shuffleCards(i, j);
			}
		} else {
			System.out.println("desk having 52 cards only....");
		}

	}

	//shuffle cards if repeated else allot
	public static void shuffleCards(int i, int j) {
		while (j < players) {
			int x = getRandomCard();
			allotcards[i][j] = carddesk[x];
			check.add(x);
			j++;
		}
	}

	// generate unique random number
	public static int getRandomCard() {
		int randomInt;
		do {
			Random rand = new Random();//random no.
			randomInt = rand.nextInt(52); // number between 0-51
		} while (check.contains(randomInt));
		return randomInt;
	}

	// **display cards..
	public static void showPlayersCard() {
		for (int i = 0; i < playcards; i++) {
			System.out.print("Card:"+(i+1)+"-->  ");
			for (int j = 0; j < players; j++) {
				if (allotcards[i][j] != null)
					System.out.print(allotcards[i][j] + "  | ");
			}
			System.out.println();
		}
	}

}
