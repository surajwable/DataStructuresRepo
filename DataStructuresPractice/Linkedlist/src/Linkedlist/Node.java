package Linkedlist;

public class Node {
	 private int data;
	 Node next;
	
	public Node(int data)
	{
		this.data=data;
		next =null;
	}
	public Node(int data,Node next)
	{
		this.data=data;
		this.next =next;
	}
	
	public void setNext(Node next)
	{
		this.next=next;
	}
	
	public Node getNext()
	{
		return this.getNext();
	}
	
	public String toString()
	{
		String str="";
		str=""+data+"-->";
		return str;
	}
}
