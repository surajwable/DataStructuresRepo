package StackLinkedList;

public class LinkedList {

	private Node head;

	public LinkedList() {
		head=null;

	}
	public void push(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}	
	}
	
	public void pop(int data)
	{
		if(head!=null)				//checking if empty or not
		{
			if(head.next==null)
			{
				Node x=head;
				head=null;				//if having a single node
				x.next=null;
			}
			else
			{
				Node x=head;
				head=x.next;        //if having multiple nodes
				x.next=null;
			}
		}
	}
}
