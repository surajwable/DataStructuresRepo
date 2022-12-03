package Linkedlist;

public class LinkedList {


	private Node head;

	public LinkedList() {
		head=null;

	}
	public void insert(Employee data)
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

	public void append(Employee data)
	{
		Node temp=new Node(data);
		if(head==null)                //checking if empty or not
		{
			head=temp;
		}
		else
		{
			Node x=head;
			while(x.next!=null)
			{
				x=x.next;

			}
			x.next=temp;
		}
	}

	public void deletefirst(Employee data)
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

	public void deletelast(Employee data)
	{
		if(head!=null)
		{
			if(head.next==null)
			{
				Node x=head;
				head=null;
				x.next=null;
			}
			else
			{
				Node itp=null;
				Node it=head;
				while(it.next!=null)
				{
					itp=it;
					it=it.next;
				}
				itp.next=null;
			}
		}else {
			System.out.println("Linked List is Empty");
		}
	}
	
	public void deleteAll(Employee data)
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

	public String toString()
	{
		String str ="";
		if(head==null)
		{
			str="Linked list is empty";
		}
		else
		{
			Node x=head;
			while(x!=null)
			{

				str +=" "+x+"-->";
				x=x.next;
			}
		}
		return str;
	}

	public void femaleEmployee()
	{
		Node x=head;
		while(x!=null)
		{
			if(x.data.getGender().equals("Female"))
			{
				System.out.println(x.data);
			}
			x=x.next;
		}
	}
	
	public void maleEmployee()
	{
		Node x=head;
		while(x!=null)
		{
			if(x.data.getGender().equals("Male"))
			{
				System.out.println(x.data);
			}
			x=x.next;
		}
	}
	{

	}
}
