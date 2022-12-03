package LLPractice;

public class LinkedList {

	private Node head;
	private int count;

	public LinkedList() {
		head=null;
	}

	public int getNodeCount()
	{
		return count++;
	}
	public void ReverseLinkedlist()
	{
		Node it=head;
		Node itp=null;
		Node itn=it;

		while(it!=null) {

			itn =it.next;
			it.next=itp;
			itp=it;
			it=itn;	
		}
		head=itp;
	}

	public void ReversePrint()
	{
		_ReversePrint(head);          
	}

	public void _ReversePrint(Node it)            //head came to it
	{
		if(it.next!=null)                         
		{
			_ReversePrint(it.next);               
		}

		System.out.print(it+"-->");               //   
	}
	public void insertbypos(Employee data,int pos)
	{
		getNodeCount();
		if(pos==1)
		{
			insert(data);
		}
		else
			if(pos==count+1)
			{
				append(data);
			}
			else
				if(pos <=0 || pos>count+1)
				{
					System.out.println("Invalid POsition");
				}
				else
				{
					getNodeCount();
					Node temp=new Node(data);
					int x=1;
					Node it=head;
					while(x!=pos-1)
					{
						it=it.next;
						x++;
					}

					temp.next=it.next;
					it.next=temp;
				}
	}

	public void deletebypos(int pos)
	{			
		
		if(pos==1)
		{
			deletefirst();
		}
		else
			if(pos==count+1)
			{
				deletelast(pos);
			}
			else
				if(pos <=0 || pos>count+1)
				{
					System.out.println("Invalid POsition");
				}
				else
				{
					getNodeCount();
					int x=1;
					Node it=head;
					while(x!=pos-1)
					{
						it=it.next;
						x++;
					}
					Node temp=it.next;
					it.next=temp.next;
					temp.next=null;		
				}		
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

	public void deletefirst()
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

	public void deletelast(int pos)
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

	public void deleteAll()
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


	{

	}
}
