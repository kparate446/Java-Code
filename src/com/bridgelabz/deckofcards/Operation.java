package com.bridgelabz.deckofcards;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import jdk.dynalink.SecureLookupSupplier;

public class Operation {

	static String suit[] = {"Clubs" ,"Diamond" ,"Hearts" ,"Spades"};
	static String rank[] = {"2" ,"3","4","5","6","7","8","9","10","jack","Queen","King","Ace"};
	//Take input From User
	public static int players=0;
	public static int playcards=0;
	//No of card distributed
	final static int totalcards =52;
	//initial card
	static String carddesk[] = new String[52];
	//2d array store allow
	static String allotcards[][] = new String[playcards][players];
	public static List<Integer> check =new ArrayList<Integer>();
	public static void generateCardCombination() {
		int cnd = 0;
		for(int i=0;i<suit.length;i++) {
			for(int j=0;j<rank.length;j++) {
				carddesk[cnd]=suit[i]+ " "+rank[j];
				cnd++;
			}
		}
	}
	public static void playerscards() {
		allotcards = new String[playcards][players];
		if(totalcards >= (playcards * players)) {
			generateCardCombination();
			for(int i=0;i< playcards;i++) {
				int j=0;
				shuffleCards(i, j);
			}
		}
		else {
			System.out.println("desk having 52 cards");
		}
	}
	//Repeated
	public static void shuffleCards(int i,int j) {
		while(j < players) {
			int x= getRandomCard();
			allotcards[i][j]=carddesk[x];
			check.add(x);
			j++;

		}
	}
	//Generate random Number
	private static int getRandomCard() {
		int randomInt;
		do {
			SecureRandom rand = new SecureRandom();
			randomInt = rand.nextInt();
		}while(check.contains(randomInt));
		return 0;
	}
	//display cards
	public static void showPlayerCard() {
		for(int i=0;i<playcards;i++) {
			for(int j=0;j<players;j++) {
				//				if(allotcards[i][j]! =null) {
				//					System.out.println([i][j]+" |");
				if(allotcards[i][j]!=null) 
					System.out.println(allotcards[i][j]+" |");

			}
			System.out.println();

		}
	}

}
