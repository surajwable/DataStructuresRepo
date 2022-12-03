package InsertionSort;

public class Insertionsort {

	public static void insert(int [] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]>arr[j-1])
				{
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;

				}
				else
					break;
			}
		}
	}
	
	public static void decending(int [] arr)
	{
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]>arr[j-1])
				{
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;

				}
				else
					break;
			}
		}
	}
	public static void printarray(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();


	}}
