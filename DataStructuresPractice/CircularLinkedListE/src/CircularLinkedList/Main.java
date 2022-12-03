package CircularLinkedList;



public class Main {

	public static void main(String[] args) {
		
		Employee suraj=new Employee(100,"suraj",80000,'m');
		Employee pritam =new Employee(200,"pritam",90000,'m');
		Employee pavan=new Employee(300,"pavan",85000,'m');
		Employee sanskruti= new Employee(400,"sanskruti",98000,'f');
		Employee siya=new Employee(500,"siya",97000,'f');
		Employee ovi=new Employee(600,"ovi",95000,'f');
		CircularLinkedList Linkedlist=new CircularLinkedList();
		for(int i=1;i<=10;i++)
		{
			Linkedlist.insert(suraj);
			
		}
		
		Linkedlist.insert(suraj);
		Linkedlist.insert(pritam);
		//Linkedlist.deleteLast();
		//System.out.print(Linkedlist);
		//Linkedlist.deleteFirst();
		Linkedlist.deleteLast();
		System.out.println(Linkedlist);
	
	}

}
