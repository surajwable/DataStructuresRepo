package BST;


public class BST {
	//root of node data type made private so that other user can't change its value
	private Node root;

	public BST() {    //parameter less constuctor
		root = null;              //root is the reference point to start a tree
	}

	public void insert(Employee  )        
	{
		root = insertNode(root, value);
	}

	private Node insertNode(Node it, Employee value) {

		if(it == null)
		{
			Node tmp = new Node(suraj);      //created an object or node temp
			return tmp;
		}

		if(value < suraj)
			it.left = insertNode(it.left, value);
		else if(value>suraj)
			it.right = insertNode(it.right, value);

		return it;

	}

	public void preOrder()
	{
		printPreOrder(root);
	}

	private void printPreOrder(Node it) {

		if(it != null)
		{
			System.out.print(it);
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}

	public void inOrder()
	{
		printInOrder(root);
	}

	private void printInOrder(Node it) {

		if(it != null)
		{
			printInOrder(it.left);
			System.out.print(it);
			printInOrder(it.right);
		}
	}

	public Employee getMinValue()
	{
		Node it=root;
		while(it.left!=null)
		{
			it=it.left;
		}
		return it.data;
	}

	public Employee getMaxValue()
	{
		Node it=root;
		while(it.right!=null)
		{
			it=it.right;
		}
		return it.data;
	}

	public void delete(Employee value)
	{
		root=deleteNode(root,value);
	}

	public Node deleteNode(Node it,Employee value) //int value-->value of a node we want to delete
	{
		if(it==null)                 
		{
			return it;
		}

		if(value>it.data)
		{
			it.right=deleteNode(it.right,value);
		}
		else
			if(value<it.data)
			{
				it.left=deleteNode(it.left,value);
			}
			else
				if(it.left!=null && it.right==null)
				{
					return it.left;
				}
				else
					if(it.left==null && it.right !=null)
					{
						return it.right;
					}
					else
						if(it.left==null && it.right==null)           
						{
							return null;
						}
						else
						{
							Employee smallvalue=getMinValue(it.right);       //having two child
							it.right=deleteNode(it.right,smallvalue);
						}
		
		return it;
	}
	
	private Employee getMinValue(Node it) {
		
		while(it.left != null)
		{
			it = it.left;
		}
		return it.data;
	}



	public String toString() {

		return "";
	}

	public void insert(Employee akash) {
		// TODO Auto-generated method stub
		
	}
}
