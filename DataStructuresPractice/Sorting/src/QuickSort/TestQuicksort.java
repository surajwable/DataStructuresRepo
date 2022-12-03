package QuickSort;

public class TestQuicksort {

	
	public static void main(String[] args)
	{
		//declaring and initializing an array
		int arr[]=new int[] {10,2,50,17,31,12,20,1};
		//make an object of class quicksort
		Quicksort sort=new Quicksort();
		
		//calling a method by instance of an object/reference.method name(arr);
		sort.quick(arr);
		
		//to print an array use classname.method name(arr);
		Quicksort.printarray(arr);
}
}

