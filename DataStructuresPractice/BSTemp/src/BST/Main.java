package BST;
public class Main {

	public static void main(String[] args) {
		Employee suraj=new Employee(1,"suraj",90000,'M');
		Employee akash=new Employee(2,"akash",98000,'M');
		Employee pritam=new Employee(3,"pritam",92000,'M');
		Employee akshay=new Employee(4,"akshay",85000,'M');
		Employee vaibhav=new Employee(5,"vaibhav",80000,'M');
		Employee sanskruti= new Employee(400,"sanskruti",98000,'f');
		Employee siya=new Employee(500,"siya",97000,'f');
		Employee ovi=new Employee(600,"ovi",95000,'f');
		
		BST employee = new BST();
		
		employee.insert(suraj);
		employee.insert(akash);
		employee.insert(vaibhav);
		//bst.insert(-1);
		//bst.insert(12);
		//bst.insert(94);
		//bst.insert(6);
		//bst.insert(77);
		
		employee.preOrder();
		System.out.println();
		employee.inOrder();
		System.out.println();
		//System.out.println(bst.getMinValue());
		//System.out.println(bst.getMaxValue());
		employee.delete(akash);
		employee.inOrder();
		System.out.println();	
	}
}
