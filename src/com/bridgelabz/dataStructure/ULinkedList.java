/**
 * Created By:- Krunal Parate
 * Date:-
 * Purpose:-
 */
package com.bridgelabz.dataStructure;
import com.bridgelabz.utility.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class ULinkedList<T> {

	public static void main(String[] args) throws IOException {
		ULinkedList<Integer> sc1 = new ULinkedList<Integer>();
		ULinkedList<String> sc = new ULinkedList<String>();
		Utility <String>utility=new Utility<String>();// Object of the utility Class
		String[] data = utility.readDataBuffer();

		for (int i = 0; i < data.length; i++) {
			utility.addFirst(data[i]);
		}
		utility.display();
		Scanner scan = new Scanner(System.in);
		//accept the search element
		System.out.println("\n Enter Search String");
		String search = scan.nextLine();

		int position = utility.index(search);

		if (position == 0) {
			utility.addLast(search);
		} else {
			utility.delete(search);
		}
		utility.show();

	}
}







