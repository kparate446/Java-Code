package com.bridgelabz.dataStructure;
import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Orderedlinkedlist<T> {

	public static void main(String[] args) throws IOException {
		//orderedlinkedlist<String> sc = new orderedlinkedlist<String>();
		Utility <String>utility=new Utility<String>();
		String[] data = utility.readDataBuffer();

		String[] arr=Utility.bubble(data, data.length);
		for (int i = 0; i < arr.length; i++) {
			utility.addLast(arr[i]);
		}
		utility.display();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// accept the search element
		System.out.println("\n Enter the Number");
		String search = scan.nextLine();

		int position = utility.index(search);

		if (position == 0) {
			utility.addLast(search);
			
		}
	
		utility.show();

	}
}
