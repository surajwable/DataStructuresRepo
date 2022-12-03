package LLPractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		LinkedList linkedlist=new LinkedList();
		Employee suraj=new Employee(1,"suraj",10000f);
		Employee pritam=new Employee(2,"pritam",20000f);
		Employee akash=new Employee(3,"akash",30000f);
		Employee vaibhav=new Employee(4,"vaibhav",40000f);
		Employee akshay=new Employee(5,"akshay",50000f);
		
		/*linkedlist.insert(suraj);
		linkedlist.insert(pritam);
		linkedlist.insert(akash);
		linkedlist.insert(vaibhav);
		linkedlist.insert(akshay);*/
		
		linkedlist.ReverseLinkedlist();
		
		Scanner sc=new Scanner(System.in);
		int choice,value;
		do
		{
			System.out.println("********Menu*********");
			System.out.println("1.Insert\n2.Delete\n3.Append\n4.InsertbyPos\n5.DeletebyPos\n6.Reverse");
			System.out.println("enter the choice");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				
				linkedlist.insert(suraj);
				linkedlist.insert(pritam);
				linkedlist.insert(akash);
				linkedlist.insert(vaibhav);
				linkedlist.insert(akshay);
				System.out.println("\n"+linkedlist);
				break;
				
			case 2 :
				linkedlist.deletefirst();
				System.out.println("\n"+linkedlist);
				break;
				
			case 3 :
				
				linkedlist.append(suraj);
				System.out.println("\n"+linkedlist);
				break;
				
			case 4 :
				linkedlist.insertbypos(akash,3);
				System.out.println("\n"+linkedlist);
				break;
				
			case 5 :
				linkedlist.deletebypos(3);
				System.out.println("\n"+linkedlist);
				break;
				
			case 6 :
				linkedlist.ReverseLinkedlist();
				System.out.println("\n"+linkedlist);
				break;
				
			case 7 :
				break;
				default :
					System.out.println("Wrong Choice ....!!!");
				
			}
		}while(choice!=7);
	}
}
			
			
			
			
			
			
			