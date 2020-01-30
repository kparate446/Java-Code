package com.bridgelabz.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		//read the file
		BufferedReader br=new BufferedReader(new FileReader("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/HashFile"));
		String str="";
		Hash h=new Hash(11);
		//read the data in line by line
		while((str=br.readLine())!=null) {
			
			String[] s1 = str.split(" ");
			System.out.println(Arrays.toString(s1));
			for(int i=0;i<s1.length;i++) {
				System.out.println(s1[i]+" ");
				h.insert(Integer.parseInt(s1[i]));
 			}
		}
			System.out.println("Enter Element to be Search");
			
			int data = sc.nextInt();//refactor-ctrl 2/atl+shift+r 
										
			boolean isdatafound = h.search(data);//return true or false
			System.out.println("Condition is "+isdatafound);
			if(isdatafound)
				h.list[h.hashIndex(data)].remove(String.valueOf(data));
			h.insert(data);
			
			System.out.println(Arrays.toString(h.list));//Print the Linkedlist
		// Write the data into file
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Bootcamp/Program/src/Resources/HashFile"));
			for(int i=0;i<h.size;i++) {
				if(h.list[i] != null) {
					String wr = h.list[i].peekFirst();//read
					System.out.println(wr+" ");
						bw.write(wr);
				}
			}
			bw.close();
		
	}		
}	
