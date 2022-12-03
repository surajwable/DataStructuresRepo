package SelectionSort;

public class SelectionSort 
{

	
	public SelectionSort()
	{
		arr= new int[5];
	}
	
	int[] arr;
	for(int i=0;i<=arr.length;i++) 
	{
		
		for(int j=i;j<=arr.length-1;j++)
		{

			if(arr[j]>arr[j+1])
			{
				int temp=arr[i];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				System.out.println(temp);
						
			}
			System.out.println(arr[i]);
			
		}
		
		public void printme()
		{
			System.out.println(arr[j]);
		}
		
	}

	
	
	
	
}
}

