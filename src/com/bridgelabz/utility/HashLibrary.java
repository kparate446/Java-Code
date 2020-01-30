package com.bridgelabz.utility;
import com.bridgelabz.utility.*;

public class HashLibrary 
{
	Utility[] list = new Utility[10];
	
	//constructor for anitialising array
	public void Hashing() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new Utility();
		}
	}
	
	//method to add elemement at appropriate position
	public void addHash(int num) {
		int mod = num % 11;
		//System.out.println(mod);
		list[mod].addFirst(num);
	}

	//to display hash element
	public void showHash() {
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
	public boolean search(int num) {
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