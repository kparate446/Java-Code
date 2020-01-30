package com.bridgelabz.dataStructure;
import com.bridgelabz.utility.Utility;
public class Prime2dArray {
	public static void main(String[] args)
	{
		int[][]result=Utility.firstNPrimes();
		System.out.println("Prime Number Stored in 2D array :");
		System.out.println();
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<25; j++)
			{
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
