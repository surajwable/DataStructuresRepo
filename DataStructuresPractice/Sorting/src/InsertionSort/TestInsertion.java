package InsertionSort;

public class TestInsertion {


	public static void main(String[] args)
	{
		int arr[]=new int[] {10,2,50,20,1,45,98,12,2,33,3,3,22,2,2,1,1,1,1};
		Insertionsort sort =new Insertionsort();
		
		Insertionsort.insert(arr);
		Insertionsort.printarray(arr);

}}
