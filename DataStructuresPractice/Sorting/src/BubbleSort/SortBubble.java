package BubbleSort;

public class SortBubble {
	
	public static void bubble(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j+1]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
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
	}
}
