package Stack;

public class Stack 
{
	private  int[] arr;      //take data members private compulsory in stack
	private int top;

	
	public Stack()
	{
		arr=new int[5];
		top=-1;
	}
	public Stack(int size)
	{
		arr =new int[size];
		top=-1;
	}
	public void push(int value)        //push method
	{
		if(top+1<arr.length)
		{
			++top;
			arr[top]=value;
		}
		else
		{
			System.out.println("stack overflow ! while pushing"+value);
		}
		
	}

public int pop()                   //pop method
{
	if(top>-1)
	{
		int value=arr[top];
		--top;
		return value;
	}
	else
	{
		System.out.println("stack underflow...!");
		return -1;	
		}
}
public String toString()
{
	String str="";
	for(int i=top;i>=0;--i)
	{
		str=str+arr[i]+",";	
	}
	return str;
}
}
