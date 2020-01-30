package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

//import com.bridgelabz.dataStructure.PrimeAnagramQueue;
//import com.bridgelabz.dataStructure.ULinkedList.Node;
//import com.bridgelabz.dataStructure.PalindromeChecker.Node;

public class Utility <T>{
	static Scanner sc = new Scanner(System.in);

	/** Used to input the String: */
	public static String inputString() {
		String str = sc.next();
		// sc.close();
		return str;
	}

	/** Used to input the Integer: */
	public static int inputNumber() {
		int number = sc.nextInt();
		return number;
	}

	/** Used to input the Double: */
	public static double inputDouble() {
		double number = sc.nextDouble();
		return number;
	}

	/** Used to Flip coin Program */
	/**
	 * Purpose: this method is used find Tail Calculator
	 * 
	 * @param tails
	 * @param n
	 * @return
	 */
	public static double tailCalculator(float tails, float n) {
		// double k=0;
		// try {
		return (100 * tails) / n;

		// catch(ArithmeticException e) {
		// System.out.println("Exception: "+e.getMessage());
		// }
		// return k;
	}

	/* Used to Head Calculator */
	/**
	 * Purpose: this method is used Head calculator
	 * 
	 * @param heads
	 * @param n
	 * @return
	 */
	public static double headCalculator(float heads, float n) {
		return (100 * heads) / n;
	}

	/* Used to Leap year or Not */
	/**
	 * Purpose: this method is used find Leap year or Not
	 * 
	 * @param year
	 * @return
	 */
	public static boolean leapOrNotLeap(int year) {
		if (year >= 1000 && year < 9999) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/* Used to Power Calculator */
	public static int calculatePower(int e, int b) {
		int p = 1;
		for (int i = 0; i < e; i++) {
			p = p * b;
		}
		return p;
	}

	/* Used to Prime Factors */
	/**
	 * Purpose: this method is used find prime factor of number
	 * 
	 * @param x
	 * @return
	 */
	public static int primeFactors(int x) {
		for (int i = 2; x > 1; i++) {
			while (x % i == 0) {
				System.out.println(i + " ");
				x = x / i;
			}
		}
		return x;
	}

	/** Used to Harmonic Calculator */
	public static double harmonic(int n) {
		float h = 1;
		for (int i = 2; i <= n; i++) {
			h += (float) 1 / i;
		}
		return (h);
	}

	/** Used to 2d Integer Matrix */
	public static int intArray(int arr[][], int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				arr[i][j] = Utility.inputNumber();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return column;
	}

	// Used to 2d Double Matrix
	public static double[][] doubleArray(double arr[][], int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				arr[i][j] = Utility.inputDouble();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

	// Used to 2d boolean Matrix
	public static boolean booleanArray(double arr[][], int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				arr[i][j] = Utility.inputDouble();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column;) {// j++
				// System.out.print(arr[i][j]+" ");
				return true;
			}
			System.out.println();
		}
		return false;
	}

	/** Used to triple sum is zero */
	/**
	 * @param arr
	 * @param n
	 */
	public static void triplet(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println();
						System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
						count++;

					}
				}
			}
		}
		if (count == 0) {
			System.out.println("Not Found");
		}
		System.out.println();
		System.out.println("Count" + count);
	}

	/** Used to distance Calculate */
	public static double getDistance(int x, int y) {
		return Math.sqrt(x * x + y * y);
	}

	/** Used to Quadratic Equation */
	public static void getRoots(double a, double b, double c) {
		double d = b * b - 4 * a * c;
		if (d > 0.0) {
			double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
			System.out.println(x1 + " " + x2);
		} else if (d == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println(r1);
		} else {
			System.out.println("No real root");
		}

	}

	/** Used to WhillChil */
	public static double getWill(double t, double v) {
		return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	}

	/** Used to Gambler games */
	public static int gambler(int stack, int goal, int num) {
		int wins = 0;// bets=0,
		for (int i = 0; i < num; i++) {
			int cash = stack;
			while (cash > 0 && cash < goal) {
				// bets++;
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				wins++;

			}

		}
		return wins;
	}

	// To Calculate Win Percentage*/
	public static int winPerc(int wins, int trail) {
		return (100 * wins) / trail;
	}

	// To Calculate Loss Percentage
	public static int lossPerc(int loss, int trail) {
		return (100 * loss) / trail;
	}

	/** To Calculate Coupon Number */
	public static int coupon(int n) {
		boolean arr[] = new boolean[n];
		int count = 0;
		int distict = 0;
		while (distict < n) {
			int val = (int) (Math.random() * (n));
			count++;
			if (!arr[val]) {
				distict++;
				arr[val] = true;
			}
		}
		return count;
	}

	/* Used to Vending machine */
	public static int vending(int amount) {
		int[] Notes = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int[] NotesCounter = new int[8];
		for (int i = 0; i < 8; i++) {
			if (amount >= Notes[i]) {
				NotesCounter[i] = amount / Notes[i];
				amount = amount - Notes[i] * NotesCounter[i];
			}
		}
		for (int i = 0; i < 8; i++) {
			if (NotesCounter[i] != 0) {
				System.out.println(Notes[i] + " : " + NotesCounter[i]);
			}
		}
		return amount;
	}

	/* Used To Calculate Day of the Week */
	public static int dayCalculator(int d, int m, int y) {
		int day, month, year, x;
		year = y - (14 - m) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;
		return day;
	}

	/* calculate Temperature */
	// Used to Convert Fahrenheit To Celsius
	public static double fahrenheitToCelsius(double f) {
		return ((f - 32) * 5 / 9);
	}

	// Used to Convert Celsius To Fahrenheit
	public static double celsiusToFahrenheit(double c) {
		return (((c * 9) / 5) + 32);
	}

	/** Used to Bubble Sort */
	public static <E extends Comparable<E>> E[] bubble(E arr[], int n) {
		E temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i)  ; j++) {
				if (arr[j-1].compareTo(arr[j]) > 0) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/** Used to Binary Search */
	public static void binary(int arr[], int n, int item) {
		int l = 0, u = arr.length - 1, m;
		while (l <= u) {
			m = (u + l) / 2;
			if (arr[m] == item) {
				System.out.println("Found");
				return;
			} else if (item > arr[m]) {
				l = m + 1;
			} else {
				u = m - 1;
			}
		}
		System.out.println("Not Found");
		// return item;
	}

	/** Used to Calculate String Anagram or Not */
	public static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);
		String first = new String(arr1);
		String second = new String(arr2);
		return first.equalsIgnoreCase(second);
	}

	/** Used to String Palindrome or Not */
	public static boolean palindrome(String s1) {
		String s2 = new String(new StringBuffer(s1).reverse());
		return s1.equals(s2);
	}

	/** To Used Insertion Sort Integer */
	public static int Insertion(int arr[], int n) {
		int i, j, temp = 0;
		for (i = 1; i < n; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && temp < arr[j]; j--)
				arr[j + 1] = arr[j];
			arr[j + 1] = temp;
		}
		return temp;
	}

	/** To used Insertion Sort String */
	public static String[] insertionSort(String[] a) {
		int len = a.length;
		int i, j;
		String key;
		for (i = 0; i < len; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j].compareTo(key) > 0) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		return a;
	}

	/** To Calculate monthly payment */
	/* To used to calculate rate of interest */
	public static int rateInterest(int rate) {
		// return (rate/100)/12;
		return rate / (12 * 100);
	}

	/* To used to calculate Year */
	public static int year(int year) {
		return 12 * year;
	}

	/* To used to calculate Payment */
	public static int payment(int p, int r, int n) {
		return (int) ((p * r) / (1 - Math.pow((1 + r), (-n))));
	}

	/* To used to Calculate interest */
	public static int interest(int payment, int n, int p) {
		return payment * n - p;
	}

	/* To calculate Square */
	public static double sqrt(int num) {
		double t = num;
		double Epsilon = 1e-15;
		while (Math.abs(t - num / t) > Epsilon * t) {
			t = (num / t + t) / 2.0;
		}
		return t;
	}

	/** To used Decimal to Binary Converter */
	public static int binaryNum(int arr[], int n) {
		int i = 0, j;
		while (n > 0) {
			arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (j = i; j >= 0; j--) {// reverse Logic
			System.out.print(arr[j]);
		}
		return j;
	}

	/** To used the Nibbles */
	public static int nibbles(int x) {
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

	/** Used to Permutation of given String */
	/* To calculate permutation */
	public static void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);

		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, i);// recurssion
				str = swap(str, l, i);
			}
		}
		// return r;
	}

	/* To calculate Swap the String */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/** Used merge Sort */
	public static void Merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;// Find Size of To Subarray merge
		int n2 = r - m;
		int L[] = new int[n1];// create temperary Array
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)// copy data to temp array
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0, k = l;// Merge the temp array
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void Sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;// find middle
			Sort(arr, l, m);
			Sort(arr, m + 1, r);
			Merge(arr, l, m, r);
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	/** Used to TicTacToe Program Function */

	static char arr[][] = new char[3][3];
	static int i = 0;
	static int j = 0;
	static int row, col = 0;
	static Random rd = new Random();

	// User function to get value
	public static void user() {
		/* code to check array still have null place for insert new element */
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == '\0') {
					flag = 1;
					break;
				}
			}
		}

		/* check if array[Board] is full */
		if (flag == 0) {
			System.out.println("Draw");
			return;
		} else {
			if (compwin() > 0) {
				System.out.println("comp wins");
				print();
				System.exit(0);
			} else {
				// Get value from User
				System.out.println("Enter Row and Col Position");
				int row = 0, col = 0;
				try {
					row = sc.nextInt();//isInteger();//Enter the row

					col = sc.nextInt();//isInteger();//Enter the column
				}catch(Exception e) {
					sc.next();
					System.out.println("Exception");
				}
				// validating input;
				int t = 0;
				while (t == 0) {
					if (row >= 0 && row <= 2 && col >= 0 && col <= 2)
						t++;
					else {
						System.out.println("Enter Valid row and pos between 0 to 2");
						row = sc.nextInt();
						col = sc.nextInt();
					}
				}
				// If position is null insert value
				if (arr[row][col] == '\0') {
					arr[row][col] = 'x';
					compAI();
				}
				// If position is Occupied
				else {
					System.out.println("Enter new Position this Position is occupied");
					user();
				}
			}
		}
	}

	/* Computer function to get value */
	static void compAI() {
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == '\0') {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Draw");
			return;
		} else {
			if (userwin() > 0) {
				System.out.println("user wins");
				System.exit(0);
			} else {
				offence();// Used to Computer Own Win
				defence();// Draw
			}
		}
	}

	static void defence() {
		/* Checking for Row that Two Adjacent Cells are Marked By User */
		for (int i = 0; i < 3; i++) {
			if ((arr[0][i] == arr[1][i] && arr[1][i] == 'x') || (arr[1][i] == arr[2][i] && arr[2][i] == 'x')
					|| (arr[2][i] == arr[0][i] && arr[0][i] == 'x')) {
				// If 3rd cell is Empty add Mark From Computer
				if (arr[0][i] == '\0') {
					arr[0][i] = 'o';
					print();
					user();
				} else if (arr[1][i] == '\0') {
					arr[1][i] = 'o';
					print();
					user();
				} else if (arr[2][i] == '\0') {
					arr[2][i] = 'o';
					print();
					user();
				}
			}
		}
		/* Checking for Column that Two Adjacent Cells are Marked By User */
		for (int i = 0; i < 3; i++) {
			if ((arr[i][0] == arr[i][1] && arr[i][1] == 'x') || (arr[i][1] == arr[i][2] && arr[i][2] == 'x')
					|| (arr[i][2] == arr[i][0] && arr[i][0] == 'x')) {
				// If 3rd cell is Empty add Mark from Computer
				if (arr[i][0] == '\0') {
					arr[i][0] = 'o';
					print();
					user();
				} else if (arr[i][1] == '\0') {
					arr[i][1] = 'o';
					print();
					user();
				} else if (arr[i][2] == '\0') {
					arr[i][2] = 'o';
					print();
					user();
				}
			}
		}
		// Diagonal 1
		if ((arr[0][0] == arr[1][1] && arr[1][1] == 'x') || (arr[1][1] == arr[2][2] && arr[2][2] == 'x')
				|| (arr[2][2] == arr[0][0] && arr[0][0] == 'x')) {
			if (arr[0][0] == '\0') {
				arr[0][0] = 'o';
				print();
				user();
			} else if (arr[1][1] == '\0') {
				arr[1][1] = 'o';
				print();
				user();
			} else if (arr[2][2] == '\0') {
				arr[2][2] = 'o';
				print();
				user();
			}
		}
		// Diagonal 2
		if ((arr[2][0] == arr[1][1] && arr[1][1] == 'x') || (arr[1][1] == arr[0][2] && arr[0][2] == 'x')
				|| (arr[2][0] == arr[0][2] && arr[0][2] == 'x')) {
			if (arr[2][0] == '\0') {
				arr[2][0] = 'o';
				print();
				user();
			} else if (arr[1][1] == '\0') {
				arr[1][1] = 'o';
				print();
				user();
			} else if (arr[0][2] == '\0') {
				arr[0][2] = 'o';
				print();
				user();
			}
		}
		/*
		 * If No Two Adjacent cell are Marked By user then Add Random Marked By Computer
		 */
		else {
			row = rd.nextInt(3);
			col = rd.nextInt(3);

			if (userwin() > 0) {
				System.out.println("user wins");
			} else if (arr[row][col] == '\0') {
				arr[row][col] = 'o';
				print();
				user();
			} else {
				compAI();
			}
		}
	}

	/* Checking for Self Winning Chances */
	static void offence() {
		/* checking for Row that Two Adjacent Cells are Marked By Computer */
		for (int i = 0; i < 3; i++) {
			if ((arr[0][i] == arr[1][i] && arr[1][i] == 'o') || (arr[1][i] == arr[2][i] && arr[2][i] == 'o')
					|| (arr[2][i] == arr[0][i] && arr[0][i] == 'o')) {
				// If 3rd cell is Empty add Mark From Computer
				if (arr[0][i] == '\0') {
					arr[0][i] = 'o';
					print();
					user();
				} else if (arr[1][i] == '\0') {
					arr[1][i] = 'o';
					print();
					user();
				} else if (arr[2][i] == '\0') {
					arr[2][i] = 'o';
					print();
					user();
				}
			}
		}
		/* Checking for Column that Two Addjacent Cells are Marked By Computer */
		for (int i = 0; i < 3; i++) {
			if ((arr[i][0] == arr[i][1] && arr[i][1] == 'o') || (arr[i][1] == arr[i][2] && arr[i][2] == 'o')
					|| (arr[i][2] == arr[i][0] && arr[i][0] == 'o')) {
				// If 3rd cell is Empty add Mark from Computer
				if (arr[i][0] == '\0') {
					arr[i][0] = 'o';
					print();
					user();
				} else if (arr[i][1] == '\0') {
					arr[i][1] = 'o';
					print();
					user();
				} else if (arr[i][2] == '\0') {
					arr[i][2] = 'o';
					print();
					user();
				}
			}
		}

		/* Diagonal 1 */
		if ((arr[0][0] == arr[1][1] && arr[1][1] == 'o') || (arr[1][1] == arr[2][2] && arr[2][2] == 'o')
				|| (arr[2][2] == arr[0][0] && arr[0][0] == 'o')) {
			if (arr[0][0] == '\0') {
				arr[0][0] = 'o';
				print();
				user();
			} else if (arr[1][1] == '\0') {
				arr[1][1] = 'o';
				print();
				user();
			} else if (arr[2][2] == '\0') {
				arr[2][2] = 'o';
				print();
				user();
			}
		}
		/* Diagonal 2 */
		if ((arr[2][0] == arr[1][1] && arr[1][1] == 'o') || (arr[1][1] == arr[0][2] && arr[0][2] == 'o')
				|| (arr[2][0] == arr[0][2] && arr[0][2] == 'o')) {
			if (arr[2][0] == '\0') {
				arr[2][0] = 'o';
				print();
				user();
			} else if (arr[1][1] == '\0') {
				arr[1][1] = 'o';
				print();
				user();
			} else if (arr[0][2] == '\0') {
				arr[0][2] = 'o';
				print();
				user();
			}
		}
	}

	// Check Computer Win
	static int compwin() {
		int pc = 0;
		if (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o') { // 1st horizontal row
			pc++;
		} else if (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o') { // 2st horizontal row
			pc++;
		} else if (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o') { // 3st horizontal row
			pc++;
		} else if (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o') { // 4st horizontal row
			pc++;
		} else if (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o') { // 5st horizontal row
			pc++;
		} else if (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o') { // 6st horizontal row
			pc++;
		} else if (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o') { // left to right Diagonal row
			pc++;
		} else if (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o') { // right to left Diagonal row
			pc++;
		}
		return pc;
	}

	// Check user Win
	static int userwin() {
		int uc = 0;
		if (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x') { // 1st horizontal row
			uc++;
		} else if (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x') { // 2st horizontal row
			uc++;
		} else if (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x') { // 3st horizontal row
			uc++;
		} else if (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x') { // 4st horizontal row
			uc++;
		} else if (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x') { // 5st horizontal row
			uc++;
		} else if (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x') { // 6st horizontal row
			uc++;
		} else if (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x') { // left to right Diagonal row
			uc++;
		} else if (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x') { // right to left Diagonal row
			uc++;
		}
		return uc;
	}

	// Printing Board
	public static void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == '\0')
					System.out.print("- ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/** End TicTacToe Program */

	/**Used to Repeated Exception*/
	//	private static int isInteger() {
	//		int num = 0;
	//		boolean ok = true;
	//		while (ok) {
	//			try {
	//				num = sc.nextInt();
	//				ok = false;
	//			} catch (Exception e) {
	//				System.out.print("not integer value:");
	//				sc.next();
	//			}
	//		}
	//		return num;
	//	}

	/******************************************Data Structure**************************************/


	/* Unsorted LinkedList*/
	/**
	 * @author admin1
	 *
	 * @param <T> :- it is used in Generics
	 */
	public class Node<T> {
		T data;
		Node next;

		Node(T d) {
			data = d;
		}

		Node(T d, Node n) {
			data = d;
			next = n;
		}
	}

	Node head, last;
	String arr1[] = new String[1000];
	int arrlength = 0;
	int count = 0;

	/**
	 * Purpose:-It is Used in Add First LinkedList
	 * @param <E>:- It is Used in Generetics
	 * @param <T>
	 * @param d:- It is Used in Input of The data
	 * @return:- it is used in Counting the data
	 */
	public <E, T> int addFirst(T d) {
		@SuppressWarnings("unchecked")
		Node n = new Node(d);
		if (head == null) {
			head = n;
			last = n;
			count++;
		} else {
			n.next = head;
			head = n;
			count++;
		}
		return count;
	}

	/**
	 * Purpose:-It is Used in Add Last LinkedList
	 * @param <E>:- It is Used in Generetics
	 * @param <T>
	 * @param d:- It is Used in Input of The data
	 * @return:- it is used in Counting the data
	 */
	public <E, T> int addLast(T d) {
		Node n = new Node(d);
		if (head == null) {
			addFirst(d);
			count++;
		} else {
			last.next = n;
			last = n;
			count++;
		}
		return count;
	}

	/**
	 * Purpose:-It is Used in Delete First LinkedList
	 * @param <E>:- It is Used in Generetics
	 * @return:- It is Used in Count the Linkedlist
	 */
	public <E> int deleteFirst() {
		if (head == null) {
			System.out.println("Empty list");
		} else {
			head = head.next;
			count--;
		}
		return count;
	}
	/**
	 * Purpose:-It is Used in Delete Last LinkedList
	 * @param <E>:- It is Used in Generetics
	 * @return:- It is Used in Count the Linkedlist
	 */
	public <E> int deleteLast() {
		if (head == null) {
			System.out.println("Empty list");
		} else {
			Node t = head;
			while (t.next != last) {
				t = t.next;
			}
			t.next = null;
			last = t;
			count--;
		}
		return count;
	}

	/**
	 * Purpose:- It is used in Add the data into position
	 * @param <E>:-It is Used in Generetics
	 * @param <T>
	 * @param d:- It is used in Input the data
	 * @param index:- to add the index of data
	 * @return:-
	 */
	public <E, T> int addAtPos(T d, int index) {
		if (index == 1) {
			addFirst(d);
		} else if (index >= (count++) || index == 0) {
			System.out.println("Invalid Index");
		} else {
			Node t = head;
			for (int i = 2; i < index; i++) {
				t = t.next;
			}
			t.next = new Node(d, t.next);
			count++;
		}
		return index;
	}
	// Display the Linkedlist
	public <E> int display() {
		if (head == null) {
			System.out.println("Empty List");
		} else {
			Node t = head;
			while (t != null) {
				System.out.println(t.data);
				t = t.next;
			}
		}
		return count;
	}
	// Show the Linkedlist
	public <E>void show() {
		Node new_node = head;
		int size = length();
		System.out.print("[");
		for (int i = 0; i < size; i++) {

			System.out.print(new_node.data + ",");
			new_node = new_node.next;

		}
		System.out.print("]");

		return;
	}
	//Search the linkedlist
	public <E>boolean search(E data){
		Node t=head;
		int i=1;
		boolean flag=false;
		if(head==null) {
			System.out.println("List Empty");
		}
		else {
			while(t!=null) {
				if(t.data==data) {
					flag=true;
					break;
				}
				i++;
				t=t.next;
			}
		}
		if(flag)
			System.out.println("Found"+i);
		else
			System.out.println("Not Found");
		return flag;
	}
	
	// Write character to the file
	public void writeData() throws IOException {
		FileOutputStream fout = new FileOutputStream("Myfile.txt", true);
		String s = "My name is Kunal";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++)
			fout.write(ch[i]);

	}
	// read the String to the file
	public <E>String[] readDataBuffer() throws IOException {
		String[] words = null;
		FileReader fw = new FileReader("./Myfile.txt");

		BufferedReader bf = new BufferedReader(fw);
		Scanner sc = new Scanner(fw);

		int j = 0;
		String s1 = "";
		// Gets each line till end of file is reached
		while ((s1 = bf.readLine()) != null) {
			// Splits each line into words
			words = s1.split(" ");
			int i;
			System.out.println(words.length);

		}
		return words;
	}
	// Length of the Linkedlist
	public int length() // find length
	{
		int length = 1;
		Node new_node = head;
		if (head == null) {

			return 0;
		}
		while (new_node.next != null) {
			length++;
			new_node = new_node.next;
		}

		return length;
	}
	// Remove The Duplicate Element
	Node RemoveDuplicate() {
		Node t = head;
		Node temp = null;
		int index = 0;
		while (t != null) {
			int flag = 0;
			Node t1 = head;
			while (t1 != null) {
				if (t != t1) {
					if (t.data == t1.data) {
						flag = 1;
					}
				}
				t1 = t1.next;
			}
			if (flag == 0) {
				if (temp == null)
					temp = t;
				else
					temp.next = t;
			}
			t = t.next;
		}
		return temp;
	}
	// To search the data into index
	public <T> int index(T data) { // Search the data
		System.out.println(data);
		Node temp = head;
		int count = 1;
		if (head.data == data) {
			return 1;
		}
		while (temp.data.equals(data) == false && temp.next != null) {
			count++;
			temp = temp.next;
		}
		if (count == length()) {
			System.out.println("Enter element not present in list");
			return 0;
		}
		return count;
	}
	// Deleted the First data
	public <T> void delete(T data) {
		Node temp = head;
		Node prev = temp;
		if (head.data.equals(data)) // start node of head of data is equal to data then
		{
			head = temp.next; // temp.next is stored on head
			return; // return the first deleted node
		}

		//checking the middle of node

		while (temp.next != null) // if temp.next is not equal to null
		{
			prev = temp; // temp node is stored on prev node
			temp = temp.next; // temp.next is point temp node
			if (temp.data.equals(data)) // if the data is match
			{
				prev.next = temp.next; // temp next node is point to previous node
				return; // and return delete data
			}
		}
		// delete last node
		if (temp.data.equals(data)) {
			prev.next = null;
		}
	}

	public void removeDuplicate() {
		// Node current will point to head
		Node current = head, index = null, temp = null;

		if (head == null) {
			return;
		} else {
			while (current != null) {
				// Node temp will point to previous node to index.
				temp = current;
				// Index will point to node next to current
				index = current.next;

				while (index != null) {
					// If current node's data is equal to index node's data
					if (current.data == index.data) {
						// Here, index node is pointing to the node which is duplicate of current node
						// Skips the duplicate node by pointing to next node
						temp.next = index.next;
					} else {
						// Temp will point to previous node of index.
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}



	/******/
	public String inputString1() {
		try {
			return sc.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	public static int inputInteger() {
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	/************ Binary search Tree***************/
	/** Purpose:- It is used in Binary search Tree
	 * @param Node
	 * @return
	 */
	public static double numberOfBinarySearchTree(double Node) {
		double numerator = factorial(2 * Node);// To find the Numerator
		double denominator = (factorial(Node + 1)) * (factorial(Node));// To find the dinominator
		double differentTrees = numerator / denominator;//To find the Tree
		return differentTrees;
	}
	public static double factorial(double i) {
		double fact = 1;
		while (i > 0) {
			fact = fact * i;
			i--;
		}
		return fact;
	}
	/* Prime 2d Array*/
	/**
	 * Purpose:- To find the prime Number or Not
	 * @param n
	 * @return
	 */
	static Scanner sc1 = new Scanner(System.in);

	public static boolean isPrime(int n)
	{
		if (n <= 1)  
		{  
			return false;  
		}
		for(int i=2; i<=n/2; i++)
		{

			int rem=n%i;
			if(rem==0)
			{
				return false;
			}

		}
		return true;

	}
	/*******************2D Prime Array**************/
	/**
	 * Purpose:- To find the 2D Prime Array
	 * @return
	 */
	public static int[][] firstNPrimes()

	{
		int prime[][] = new int[10][25];

		int f1=0, f2=0, f3=0, f4=0, f5=0, f6=0, f7=0, f8=0, f9=0, f10=0;
		for(int i=2; i<=1000; i++)
		{
			boolean pm=isPrime(i);
			if(pm)
			{
				if(i<100)
				{

					prime[0][f1]=i;
					f1++;
				}
				else if(i<200)
				{
					prime[1][f2]=i;
					f2++;
				}
				else if(i<300)
				{
					prime[2][f3]=i;
					f3++;
				}
				else if(i<400)
				{
					prime[3][f4]=i;
					f4++;
				}
				else if(i<500)
				{
					prime[4][f5]=i;
					f5++;
				}
				else if(i<600)
				{
					prime[5][f6]=i;
					f6++;
				}
				else if(i<700)
				{
					prime[6][f7]=i;
					f7++;
				}
				else if(i<800)
				{
					prime[7][f8]=i;
					f8++;
				}
				else if(i<900)
				{
					prime[8][f9]=i;
					f9++;
				}
				else
				{
					prime[9][f10]=i;
					f10++;
				}
			}

		}
		return prime;
	}
	/**************************/
	/* Balanced Parathesis*/


	/******************Prime Anagram*******************/

	//to check no is prime or not in bet range
	/**
	 * @param range:-It is used in to find the Prime no. upto the range
	 * @return:- It is used in return the prime No.
	 */
	public static int[] PrimeNumber(int range)
	{
		boolean isPrime = true;
		int count = 0;
		int primeno[] = new int[range];  
		for (int i = 0; i <= range; i++)        
		{  
			for(int j = 2; j<i ;j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
					break;
				}
				else
					isPrime = true;
			}
			if(isPrime == true)
				primeno[count++] = i;
		}
		return primeno ;    
	}
	/**
	 * Calculate Anagram
	 * @param primeno:- Input of the prime no. to check Whether Number is Anagram or not
	 * @return:- It is used in return the Anagram value
	 */
	public static int[] checkAnagram(int[] primeno)
	{

		System.out.println("\nThe prime number which are Anagram:");
		int anagram = 0;
		int[] anagramArray = new int[primeno.length];
		for (int  i = 0; i < primeno.length; i++)
		{
			for (int j = 0; j < primeno.length; j++)
			{
				if(primeno[i]>0 && primeno[j]>0 && primeno[i]!=primeno[j])
				{    
					String string1 = Integer.toString(primeno[i]);
					String string2 = Integer.toString(primeno[j]);
					anagram=checkPrimeAnagram(string1, string2); // ii is used in Prime checker
					if(anagram>0)
					{
						anagramArray[i] = anagram;
					}
				}
			}
		}
		return anagramArray;        
	}
	/**
	 * @param string1:- input of 1st String
	 * @param string2- input od 2nd Sting
	 * @return:- return the prime Anagram
	 * 
	 */
	private static int checkPrimeAnagram(String string1, String string2)
	{
		int anagram =0 ;
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		boolean result=false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		result = Arrays.equals(ch1,ch2);
		if(result==true)
		{
			anagram = Integer.parseInt(string1);

			return anagram;
		}
		return anagram;
	}


	/**
	 * To print the twoDPrimeAnagram
	 * @param anagram
	 */
	public static void twoDPrimeAnagram(int[] anagram)
	{
		int row = 20 ,column = 26;
		int[][] anagramArray = new int[row][column];
		int temp = 100 , k=0;
		for(int i = 0 ;i<row; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(k<anagram.length )
				{
					if(anagram[k] <= temp )
					{
						anagramArray[i][j] = anagram[k];
						k = k+1;
					}
				}
			}
			temp = temp + 100;
		}

		System.out.println("");
		for(int i = 0 ;i<row ; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(anagram[j]>0)
				{
					//printing prime anagram numbers in 2D array
					if(anagramArray[i][j] != 0)
					{
						System.out.print(anagramArray[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
	}
	/******************prime Anagram Queue*****************/

	static int counter=0;
	//	 static PrimeAnagramQueue qt=new PrimeAnagramQueue();
	static Stack<Integer> qt = new Stack<Integer>();

	/**
	 * @param first
	 * @param last
	 */
	public static void primeandAnagram(int first, int last)
	{
		Utility ut=new Utility();
		//array to store the prime number
		int arr[]=new int[last];

		//fine prime number bet range
		for(int i=first;i<last;i++)
		{
			if(isPrime(i))
			{
				arr[counter]=i;//insert element if it prime
				counter++;
			}
		}

		//print prime number*/

		System.out.println("Prime numbers are: ");
		for(int k=0;k<counter;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println("The prime and anagram numbers are: ");
		for(int j=0;j<counter;j++)
		{
			int reverse=anagram(arr[j]);
			{
				for(int k=0;k<counter;k++)
				{
					if(arr[k]==reverse)
					{
						ut.addLast(arr[k]);
						//						 qt.insertAtEnd(arr[j]);
						//						 qt.insertAtEnd(reverse);


					}
				}
			}
			System.out.println(reverse);
		}
	}
	public static int anagram(int n)
	{
		int rem,sum=0;
		while(n > 0)
		{
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n/10;
		}
		return sum;
	}
	/********************** Prime Anagram Stack**********************/
	static Stack<Integer> st = new Stack<Integer>();
	static int counter1 = 0;

	/**
	 * @param first:- input of First value
	 * @param last:- input of Second Value
	 */
	public static void primeandAnagram1(int first, int last)
	{

		//array to store the prime number
		int arr[] = new int[last];

		//check numbers are prime or not


		for(int i=first;i<last;i++)
		{
			if(isPrime(i))
			{
				arr[counter]=i;//insert element if it prime
				counter++;
			}
		}

		//print prime number
		System.out.println("Prime numbers are: ");
		for(int k=0;k<counter;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println("The prime and anagram numbers are: ");
		for(int k = 0;k < counter; k++)
		{
			//			int reverse = Utility.checkAnagram( int arr);
			int reverse =anagram(arr[k]);
			{
				for(int j = 0;j < counter; j++)
				{
					if(arr[j] == reverse)
					{
						st.push(arr[k]);
						st.push(reverse);
					}
				}
			}
			System.out.println(reverse);
		}

	}

	//to check number is prime or not
	/**
	 * @param n-check the one by one value
	 * @return
	 */
	public static boolean isPrime1(int n)
	{
		if (n <= 1)  
		{  
			return false;  
		}
		for(int i=2; i<=n/2; i++)
		{

			int rem=n%i;
			if(rem==0)
			{
				return false;
			}

		}
		return true;
	}
	/**
	 * Check the value is Anagram or Not
	 * @param n
	 * @return
	 */
	public static int anagram1(int n)
	{
		int rem,sum=0;
		while(n > 0)
		{
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n/10;
		}
		return sum;
	}
	/****************Calender*******************/
	static int[][] calender = new int[5][7]; //7*5=Maximum 35 days Count
	static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static void initCal()
	{
		for (int i = 0; i < calender.length; i++)
		{
			for (int j = 0; j < calender[i].length; j++)
			{
				calender[i][j] =-1;
			}
		}
	}

	/**
	 * @param m- Enter the month to find the Month of calender
	 */
	static void display(int m)
	{
		System.out.println("        Sun     Mon     Tue     Wed     Thu     Fri     Sat");
		for (int i = 0; i < calender.length; i++)
		{
			for (int j = 0; j < calender[i].length; j++)
			{
				if (calender[i][j] < 0 || calender[i][j] > month[m - 1])
				{
					System.out.print("\t ");
				}
				else if (calender[i][j] > 0)
				{
					System.out.print("\t" + calender[i][j] + " ");
				}
			}
			System.out.println("\t");
		}
	}

	/**
	 * @param d:- to find the day of Week
	 */
	static void putCalender(int d)
	{
		int d1 = 1;//d=3
		for (int i = d; i < calender[0].length; i++)//Error
		{
			//System.out.print(d1);
			calender[0][i] = d1++;//5
		}
		for (int i = 1; i < calender.length; i++)//d1=33
		{
			for (int j = 0; j < calender[i].length; j++)//5
			{
				calender[i][j] = d1++;
			}
		}

	}
	/**
	 * @param m:- to find the month
	 * @param y:- TO find the year
	 * @return- day of week
	 */
	static int dayOfWeek(int m, int y)
	{
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	/**
	 * Display the calender
	 * @param m
	 * @param y
	 */
	public static void dispCalender(int m, int y)
	{
		int d = dayOfWeek(m, y);
		initCal();
		putCalender(d);
		display(m);
	}
	/***************************************/
	static Scanner scanner=new Scanner(System.in);
	public  static int ReadIntegers()
	{
		return scanner.nextInt();
	}


	public static int enddate(int month,int year)
	{
		int[]month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int end_date;
		if(month==2 && year%4==0)
		{
			month_days[month-1]=29;
		}
		end_date=month_days[month-1];
		return end_date;
	}
	public static int dayofweek(int day,int month,int year)	
	{
		double y0 = (year - (14 - month) / 12);
		double x = y0 + y0/4 - y0/100 + y0/400;
		double m = month + 12 * ((14 - month) / 12) - 2;
		double d = (day + x + (31*m)/12) % 7;
		return (int) d;
	}
	public  void enQueue(T item) {
		@SuppressWarnings("unused")
		Node front = head;
		addUnordered(item);
	}
	public  void addUnordered(T item) 
	{
		Node<T> newNode = new Node<T>(item);
		if (head == null) 
		{
			head = newNode;
		} else 
		{
			Node<T> temp = head;
			while (temp.next != null) 
			{
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}
	/*******************File handling********************/

	/**
	 *Purpose:- It is used in Read The file into .txt formate
	 * @throws IOException:- It is used in input output exception
	 */
	public static void readFile() throws IOException {
		int i;
		FileInputStream fis=new FileInputStream("/.MyFile.txt");
		do {
			i=fis.read();
			if(i!=-1)
				System.out.println((char)i);
		}while(i!=-1);
		fis.close();
	}

	/**
	 * Purpose:- It is Used in Write the file into .txt formate
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void writeFile() throws InterruptedException, IOException {
		int i;
		FileOutputStream fout= new FileOutputStream("./MyFile.txt");
		String s="TATA";
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
			fout.wait(ch[i]);
		fout.close();
	}

	/**Palindrome Checker*/

	public int size;  
	public Node head1 = null;  
	public Node tail = null;   
	// It is used in Adding the data into linkedList 
	/**
	 * @param data:- It is used in adding the data
	 * 
	 */
	public void addNode(int data) {  
		Node newNode = new Node(data);  
		if(head == null) {  
			head = newNode;  
			tail = newNode;  
		}  
		else {   
			tail.next = newNode;  
			//newNode will become new tail of the list  
			tail = newNode;  
		}  
		size++;  
	}  
	// Reverse the linkedlist

	/**
	 * @param data:-It is used in input to the data
	 * @return:- it is Used in return the reverse linkedlist
	 */
	public Node reverseList(Node data){  
		Node current = data;  
		Node prevNode = null, nextNode = null;  
		//Swap the previous and next nodes of each node to reverse the direction of the list  
		while(current != null){  
			nextNode = current.next;  
			current.next = prevNode;  
			prevNode = current;  
			current = nextNode;  
		}  
		return prevNode;  
	}   

	/***
	 * It is used in palindrome Checker
	 */
	public void isPalindrome(){  
		Node current = head;  
		boolean flag = true;  
		//Store the mid position of the list  
		int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  

		//Finds the middle node 
		for(int i=1; i<mid; i++){  
			current = current.next;  
		}  
		Node revHead = reverseList(current.next);   
		while(head != null && revHead != null){  
			if(head.data != revHead.data){  
				flag = false;  
				break;  
			}  
			head = head.next;  
			revHead = revHead.next;  
		}  

		if(flag)  
			System.out.println("Given linked list is a palindrome");  
		else  
			System.out.println("Given linked list is not a palindrome");  
	}   
	/**
	 * It is used in Display the LinkedList
	 */
	public void display1() {   
		Node current = head;  

		if(head == null) {  
			System.out.println("List is empty");  
			return;  
		}  
		System.out.println("Nodes of linked list: ");  
		while(current != null) {  
			System.out.print(current.data + " ");  
			current = current.next;  
		}  
		System.out.println();  
	}
	/**********************************************/
	public void hashing(int key) {
		if(head==null) {
			return ;
		}
		else {
			Node t=head;
			Node temp=t.next;
			while(t!=null) {
				while(temp!=null) {
					if(t.data==temp.data) {
						System.out.println(t.data);
						t=t.next.next;
					}
				}
			}
			temp=temp.next;
			t=t.next;
		}
	}
	///*******************************************************************************************///
	Utility[] list = new Utility[10];
	
	//constructor for anitialising array
	public <E> void Hashing() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new Utility();
		}
	}
	
	//method to add element at appropriate position
	public <E> void addHash(int num) {
		int mod = num % 11;
		//System.out.println(mod);
		list[mod].addFirst(num);
	}

	//to display hash element
	public <E> void showHash() {
		for (int i = 0; i < list.length; i++) {
			System.out.print(i+" ");
			if(list[i]==null) {
				System.out.println(" Empty");
			}else {
				list[i].show();
			}
		}
	}

		// to search hash element
	public<E> boolean search(int num) {
		 int mod = num % 11;
		 if(list[mod].search(num))
			 return true;
		return false;
	}
	
	// to remove hash element
	public void remove(int num) {
		int mod = num % 11;
		list[mod].deleteLast();
	}
}
