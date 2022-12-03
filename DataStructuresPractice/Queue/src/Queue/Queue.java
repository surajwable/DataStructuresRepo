package Queue;

public class Queue {

	private int []arr;
	private int F;
	private int R;

	public Queue() {
		arr= new int[5];
		F=R=-1;

	}
	public Queue (int size)    
	{
		arr=new int[size];
		F=R=-1;
	}
	public void insert(int value)      //Queue full condition
	{
		if(R<arr.length)              //R will increment until it is not equal to size of array 
		{
			R=R+1;
			arr[R]=value;

			//now checking for the first value 
			if(F==-1)
			{
				F=0;
			}
		}
		else
		{
			System.out.println("Queue is Full......!!!!!");
		}
	}
	public int remove()
	{
		int retvalue;
		//Queue empty condition
		if(F!=R)
		{
			retvalue=arr[F];
			F=F+1;
			if(F==R) {                        //on zero index F==R
				F=R=-1;                        //both will decrement to front position and stack will be empty
			}

		}
		else 
		{
			System.out.println("Queue is Empty......!!!!");

		}
		return 0;                         //

	}
	public String toString()
	{
		String str ="";
		for(int i=F;i<=R;i++)
		{
			str=str+" "+arr[i]+" ";
		}
		return str;

	}

}

