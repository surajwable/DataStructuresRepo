package QuickSort;

public class Quicksort {
	
	public void quick(int[]arr)
	{
		quicksort(arr,0,arr.length-1);               	//this is before partition for user convenience
	}													//abstracted for user convenience
	
	private static void quicksort(int[] arr,int low,int high)  //arguments taken from main
	{
		if(low<high)                                  
		{
			int pi=partition(arr,low,high);				//Recursive function
			quicksort(arr,low,pi-1);					//i will return to pi
			quicksort(arr,pi+1,high);
		}
	}
	private static int partition(int[]arr,int low,int high)
	{
		int i=low-1;
		int p=high;
		for(int j=low;j<high;j++)						
		{
			if(arr[j]<arr[p])
			{
				i++;
				int temp=arr[j];                       // swapping j with i
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;                                          //after the all array elements are traversed
		int temp=arr[p];								//swapping p with i
		arr[p]=arr[i];
		arr[i]=temp;
		return i;									  //i return and array is divided from the iTH index on both sides
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
