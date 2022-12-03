package CircularLinkedList;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList Linkedlist=new CircularLinkedList();
		for(int i=1;i<=10;i++)
		{
			Linkedlist.insert(i*1);
			
		}
		//Linkedlist.deleteLast();
		//System.out.print(Linkedlist);
		//Linkedlist.deleteFirst();
		//Linkedlist.deleteLast();
		Linkedlist.deleteAll();
		System.out.println(Linkedlist);
		
	}

}
