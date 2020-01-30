package com.bridgelabz.utility;

import java.util.Scanner;

public class test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int val = check();
		System.out.println(val);
	}
	private static int check() {
		int num = 0;
		boolean ok = true;
		while (ok) {
			try {
				num = sc.nextInt();
				ok = false;
			} catch (Exception e) {
				System.out.print("not integer value:");
				sc.next();
			}
		}
		return num;
	}
	
}
