package CircularLinkedList;

public class CircularLinkedList {

	private Node head;


	public CircularLinkedList()
	{
		head=null;
	}

	public void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			temp.next=head;
		}
		else
		{
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}

			it.next=temp;
			temp.next=head;
			head=temp;

		}
	}

	public void append(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			temp.next=head;
		}
		else
		{
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}

			it.next=temp;
			temp.next=head;
		}
	}


	public void deleteFirst()
	{
		
		if(head!=null)
		{
			//for single node 
			if(head.next==head)
			{
				Node temp=head;         
				head=null;
				temp.next=null;
			}
			else
			{
				Node it=head;
				Node temp=head;
				while(it.next!=head)
			{
				it=it.next;
			}
			head=head.next;
			it.next=head;
			temp.next=null;
		}
		}
	}
	
	public void deleteLast()
	{
		//only for multiple nodes
		Node it = head;
	    Node itp = null;
		while(it.next!=head)
		{
			itp=it;
			it=it.next;
		}
		itp.next=head;
		it.next=null;
	}
	
	public void deleteAll()
	{
		Node it=head;
		Node itp=null;
		do
		{
		itp=it;
		it=it.next;
		deleteLast();
		}
		while(it!=head);
			
	}

	public String toString()
	{
		String str="";
		Node it=head;
		do
		{
			str+=""+it+" ";
			it=it.next;

		}
		while(it!=head);
		
			return str;
	}


}
