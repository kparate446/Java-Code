package com.bridgelabz.logical;
import com.bridgelabz.utility.Utility;
public class StopWatch {
	public static void main(String args[]) {
		int choice=0;
		long start=0,end=0;
		int s=0;
		System.out.println("Enter the Choice");
		System.out.println("1.Start the Stopwatch");
		System.out.println("2.End the Stopwatch");
		do {
			try {
			choice=Utility.inputNumber();
			}catch(Exception e) {
				System.out.println("Exception:"+"Please Enter the Number");
			}
			if(choice==1 && s==0) {
				choice=1;
				
			}
			else if(choice==2 && s==0) {
				System.out.println("Prss 1 to Start First:");
				continue;
			}
			else if(choice!=2) {
				System.out.println("Stopwatch is Alread start please press 2 for exit");
				continue;
			}
			
			switch(choice){
			case 1:start=System.currentTimeMillis();
			System.out.println("Stopwatch is start press2 for stop");
			s=1;
			break;
			case 2 :end=System.currentTimeMillis();
			s=0;
			break;
			default:
				System.out.println("Enter the valid choice");
				break;
			}
		}while(s==1 && choice<=2);
		System.out.println("Time that elpases between the start & end clicks: 1"+(end-start)+"  Milisecond");
	}
}
