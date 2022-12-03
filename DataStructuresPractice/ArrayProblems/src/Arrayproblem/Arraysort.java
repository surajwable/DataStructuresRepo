package Arrayproblem;

public class Arraysort {


	static int k=0,j=0,i=0;
	public static void main(String[]args)
	{
		int arr1[]=new int[] {2,12,45,90};
		int arr2[]=new int[] {7,18,30,97};

		int arr3[]=new int[8];
		while(i<arr1.length && j<arr2.length)
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
				k++;
			}

		while(i<arr1.length)
		{
			arr3[k]=arr1[i];
			i++;
			k++;

		}

		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			j++;
			k++;

		}

		for(int i=0;i<8;i++)
		{
			System.out.println(arr3[i]);
		}


	}
}


