package Queue;

public class Main {

	public static void main(String[] args) {
		Queue queue=new Queue(5);
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		queue.remove();
		queue.remove();
		queue.remove();
		
		
		System.out.println(queue);
		
		
	}

}
