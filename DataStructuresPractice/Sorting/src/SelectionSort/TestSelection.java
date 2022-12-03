package SelectionSort;

public class TestSelection {

	public static void main(String[] args) {
		int arr[]=new int[] {10,2,50,17,31,12,20,1};
		Selection sort=new Selection();
		
		Selection.Sort(arr);
		Selection.printarray(arr);
	}
}