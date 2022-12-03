package Linkedlist;

public class Node {
	 private Employee data;
	Node next;
	
	public Node(Employee data)
	{
		this.data=data;
		next =null;
	}
	public Node(Employee data,Node next)
	{
		this.data=data;
		this.next =next;
	}
	public String toString()
	{
		String str="";
		str=""+data+"-->";
		return str;
	}
}
