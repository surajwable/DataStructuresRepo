package CircularQueue;

public class MainCircular {

	public static void main(String[] args) {
		
		CircularQueue circularqueue=new CircularQueue(5);
		
		circularqueue.insert(10);
		circularqueue.insert(20);
		circularqueue.insert(30);
		circularqueue.insert(40);
		circularqueue.insert(50);
		circularqueue.remove();
		circularqueue.remove();
		
		System.out.println(circularqueue);
	}

}
