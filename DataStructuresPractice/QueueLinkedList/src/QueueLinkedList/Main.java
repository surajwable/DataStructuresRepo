package QueueLinkedList;



public class Main {

	public static void main(String[] args) {
		
		LinkedList Queue=new LinkedList();
		
		Queue.insert(10);
		Queue.insert(20);
		Queue.insert(30);
		Queue.insert(40);
		Queue.insert(50);
		Queue.remove(10);
		Queue.remove(20);
		Queue.remove(30);
		
		
		System.out.println(Queue);
	}

}
