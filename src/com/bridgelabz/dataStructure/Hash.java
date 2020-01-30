package com.bridgelabz.dataStructure;

import java.util.Arrays;
import java.util.LinkedList;

public class Hash {
	LinkedList<String>[] list;
	public Hash(int size) {//alt+Shift+s
		  list = new LinkedList[size];
		this.size = size;//global variable
	}
	

	public int size;
	
	public void insert(int data) {
		int hashIndex = hashIndex(data);//ctrl 1
		if(this.list[hashIndex] == null) {
			
			this.list[hashIndex] = new LinkedList();//create new linkedlist
			
		}
		this.list[hashIndex].add(String.valueOf(data));//add the into the linkedlist
//		System.out.println(Arrays.toString(list));
	}

	int hashIndex(int data) {
		return data % this.size;//Operation
	}
	// Search the data into linked list
	public boolean search(int data) {
		int hashIndex = hashIndex(data);
		if(this.list[hashIndex] == null) 
			return false;
		
		return this.list[hashIndex(data)].contains(String.valueOf(data));//search
//		return true;
		
	}
}