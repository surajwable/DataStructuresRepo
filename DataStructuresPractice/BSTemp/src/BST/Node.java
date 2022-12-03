package BST;

public class Node {
	
	Employee data;
	Node left;
	Node right;

	public Node(Employee suraj) {
		this.data = suraj;
		left=right=null;
	}
	public String toString() {
		String str="";
		str = "" + data + ", ";
		return str;
	}
}
