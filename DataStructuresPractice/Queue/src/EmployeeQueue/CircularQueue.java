package EmployeeQueue;

public class CircularQueue {

	static Employee[]arr=new Employee[5];
	           
	private int F;
	private int R;

	void insert(Employee value)
	{
		//Queue FULL condition                                    
		if( (F==0 && R==arr.length-1)  ||       //if (F=0 and R=4) or R+1=F
				(R+1 == F))
		{
			System.out.println("Full");          
		}
		else
		{
			R = (++R % arr.length);            //condition for increment after 4 
			arr[R] = value;                   
			if(F==-1)
				F=F+1;
		}
	}

	public Employee remove()
	{
		Employee retValue = 0;                         

		//check for empty
		if(F==-1)
		{
			System.out.println("Empty");
		}
		else
		{
			retValue = arr[F];
			//Check for last element
			if(F==R)
				F=R=-1;
			else
			{
				F = (++F % arr.length);
			}
		}

		return retValue; 
	}

	public String toString() {

		String str= "";

		if(F==-1)
		{
			str = "Queue is empty!";
		}
		else {
			int i = F;
			while(true)
			{
				str = str + arr[i] + ",";

				if(i == R)
					break;

				i = (++i % arr.length);
			}
		}
		return str;
	}

}
