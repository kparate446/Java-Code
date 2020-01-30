import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
public class SortDuplicateLinkedList<T> {
	//	public class SortDuplicateLinked {
	//		Unorderedlist list12= new  Unorderedlist();

	static int count=0;
	class Node{
		T data;
		Node next;

		Node(T e){
			data=e;

		}

	}
	String arr[]=new String[1000];
	int arrlength=0;
	public Node head=null;
	public <E>void add(T data){
		if(head==null){
			head=new Node(data);
			count++;
		}else
		{
			Node currentnode=head;
			while(currentnode.next!=null){
				currentnode=currentnode.next;
			}
			currentnode.next=new Node(data);
			count++;
		}

	}

	public <E>void display(){
		Node current = head;

		while(current!=null){
			System.out.println(current.data);
			current=current.next;

		}
	}

	public <E extends Comparable <E> >void sortDuplicate(){
		Node currentNode = head;
		Node currentNode1=null;
		T temp;
		if(head==null){
			return;
		}
		else{
			while(currentNode!=null){
				currentNode1=currentNode.next;
				while(currentNode1!=null){
					if(currentNode.data == currentNode1.data) {
//					if(currentNode.next(currentNode1.data)){
						temp=currentNode.data;
						currentNode.data=currentNode1.data;
						currentNode1.data=temp;
					}
					currentNode1=currentNode1.next;
				}
				currentNode=currentNode.next;

			}
		}
	}

	public <E> void removeDuplicate()
	{
		Node currentNode=head;
		Node c2=null;
		Node temp=null;
		//int flag=0;

		if(head==null){
			return;

		}
		else{
			while(currentNode!=null){
				temp=currentNode;
				c2=currentNode.next;
				while(c2!=null){
					if(currentNode.data==c2.data){
						temp.next=c2.next;
					}
					else
					{
						temp=c2;
					}
					c2=c2.next;

					temp=temp.next;
				}
//				currentNode=currentNode.next;

			}
		}

	}
	public <E> void writeData() throws IOException {
		FileOutputStream fout= new FileOutputStream("file.txt",true);
		String s="My name is Krunal";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
			fout.write(ch[i]);
	}
	public <E> void readData()throws IOException{
		int i,j;
		j=0;
		FileInputStream fin=new FileInputStream("./file.txt");
		do {
			i=fin.read();
			if(i!=-1)
				//System.out.print((char)i);
				//				arr[j]=(char)i;
				j++;
		}while(i!=-1);
		for(i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
		}
	}
	public<E> void writeDataBuffer()throws IOException{
		FileWriter fw=new FileWriter("file.txt");
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("Hello how are you");
	}
	public<E> void readDataBuffer() throws IOException{
		FileReader fw=new FileReader("./file.txt");
		//			BufferedWriter bf=new BufferedWriter(fw);
		BufferedReader bf=new BufferedReader(fw);
		Scanner sc = new Scanner(fw);
		//			bf.write("Hello how are you");
		int j=0;
		String s1;
		//			while((s1=bf.)!=null) {
		//				System.out.println(s1);
		//				arr[j]=s1;
		//				j++;
		//			}
		while(sc.hasNext())
		{
			//System.out.println(sc.next());
			arr[arrlength]=sc.next();
			arrlength++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		SortDuplicateLinkedList sc1=new SortDuplicateLinkedList();
//		ULinkedList<Integer> sc1=new ULinkedList<Integer>();
//		SortDuplicateLinkedList<String> sc1=new SortDuplicateLinkedList<String>();
//		sc1.writeData();
		/*sc1.readDataBuffer();
		for(int i=0;i<sc1.arrlength;i++) {
			sc1.add(sc1.arr[i]);
		}
//		sc1.removeDuplicate();
		sc1.sortDuplicate();
		sc1.display();*/
		sc1.add(1);
		sc1.add(5);
		sc1.add(9);
		sc1.add(7);
		sc1.add(0);
		System.out.println("unsorted list");
		sc1.display();

		sc1.sortDuplicate();
		System.out.println("Sorted list");
		sc1.display();
		System.out.println("remove duplicate");
		sc1.removeDuplicate();
		sc1.display();
	}
}
