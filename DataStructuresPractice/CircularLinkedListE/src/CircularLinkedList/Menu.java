package CircularLinkedList;

import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CircularLinkedList Linkedlist=new CircularLinkedList();
	
		int choice;
		do 
		{
			System.out.println("****************MENU*******************");
			System.out.println("1.Selection Sort 2.Quicksort 3.Insertion Sort 4.Bubble Sort");
			System.out.println("Enter the choice from above menu....!");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1: Selection sort=new Selection();

			Selection.Sort(arr);
			Selection.decending(arr);
			Selection.printarray(arr);
			break; 
				

			case 2:
				//int arr[]=new int[] {10,2,50,17,31,12,20,1};
				Quicksort sort1=new Quicksort();

				sort1.quick(arr);
				Quicksort.printarray(arr);
				break;

			case 3:
				//int arr[]=new int[]{10,2,50,17,31,12,20,1};
				Insertionsort sort2 =new Insertionsort();

				Insertionsort.insert(arr);
				Insertionsort.printarray(arr);
				break;

			case 4:
				//int arr[]=new int[] {10,2,50,17,31,12,20,1};
				SortBubble sort3 =new SortBubble();

				SortBubble.bubble(arr);
				SortBubble.printarray(arr);
				break;

			case 5: 
				break;
			default:
				break;


			}

		} while(choice!=5);

	}

}
