package MenuSort;

import BubbleSort.SortBubble;
import InsertionSort.Insertionsort;
import QuickSort.Quicksort;
import SelectionSort.Selection;

import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[]=new int[] {10,2,50,17,31,12,20,1};
		int choice;
		do 
		{
			System.out.println("****************MENU*******************");
			System.out.println("1.Selection Sort 2.Quicksort 3.Insertion Sort 4.Bubble Sort");
			System.out.println("Enter the choice from above menu....!");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1: 

				int choice1;
				do
				{
					System.out.println("****************MENU*******************");
					System.out.println("1. Ascending 2. Descending");
					choice=sc.nextInt();
					switch(choice1)
					{
					case 1:
						Selection.Sort(arr);
						Selection.printarray(arr);
						break;
					case 2:
						Selection.decending(arr);
						Selection.printarray(arr);
						break;

					default:
						break;
					}}
					while(choice1!=0)


				}
				/*

			Selection sort=new Selection();

			Selection.Sort(arr);
			Selection.decending(arr);
			Selection.printarray(arr);
			break; 
				 */

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
