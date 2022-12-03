package BubbleSort;

public class TestBubble {

	public static void main(String[] args) {
		int arr[]=new int[] {10,2,50,20,1,45};
		SortBubble sort =new SortBubble();
		
		SortBubble.bubble(arr);
		SortBubble.printarray(arr);
	
	}

}
