package SelectionSort;

public class Selection {
	
	//int [] arr= {10,34,25,76,56};
	
	
	 public static void Sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
					{
					int temp= arr[ i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					}
			}
		}
	}
	 
	 
	 public static void decending(int arr[])
		{
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
						{
						int temp= arr[ i];
						arr[i]=arr[j];
						arr[j]=temp;
						
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