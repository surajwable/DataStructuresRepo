package Linkedlist;

public class MainLinked {

	public static void main(String[] args) {


		Employee suraj=new Employee(100,"suraj",80000,'m');
		Employee pritam =new Employee(200,"pritam",90000,'m');
		Employee pavan=new Employee(300,"pavan",85000,'m');
		Employee sanskruti= new Employee(400,"sanskruti",98000,'f');
		Employee siya=new Employee(500,"siya",97000,'f');
		Employee ovi=new Employee(600,"ovi",95000,'f');

		LinkedList linkedlist=new LinkedList();
		linkedlist.insert(suraj);
		linkedlist.insert(pritam);
		linkedlist.insert(pavan);
		linkedlist.insert(sanskruti);
		linkedlist.deletelast(siya);
		linkedlist.deletelast(suraj);
		linkedlist.insert(siya);
		linkedlist.insert(ovi);
		linkedlist.insert(suraj);
		linkedlist.femaleEmployee();

		System.out.println(linkedlist);

	}

}
