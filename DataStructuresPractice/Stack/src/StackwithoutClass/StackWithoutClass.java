package StackwithoutClass;

import Stack.Stack;

public class StackWithoutClass 
{
	private  int[] arr;      //take data members private compulsory in stack
	private int top;

	
	public StackWithoutClass()
	{
		arr=new int[5];
		top=-1;
	}
	public StackWithoutClass(int size)
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
public static void main(String[] args) {
	Stack arr=new Stack();
	arr.push(10);
	arr.push(20);
	arr.push(30);
	arr.push(40);
	arr.push(50);
	System.out.println(arr);

}
}




	


