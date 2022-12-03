package Practice;

public class Student {
	
	public int number1;
	//public String name;
	public int number2;
	public int sum;
	
	
	public void SetValues()
	{
		number1=20;
		number2=10;
	}
	public void display()
	{
		System.out.println(+number1+" "+number2+"  ");
	}
	
	public void add()
	{
		sum=number1+number2;
		//System.out.println("the sum is::" +sum);
		
	}
	public void displayadd()
	{
		
		System.out.println(+sum);
	   
	}
	public void sub()
	{
		int subs=number1-number2;
		System.out.println("the substraction is:: "+subs);
	}
	
}
