package DQueue;

public class Dqueue {

	private int F;
	private int R;
	private int arr[];

	public Dqueue() {
		this(5);
	}
	public Dqueue(Student size)    
	{
		arr=new[5];
		F=R=-1;
	}

	public void InsertfromF(Student suraj)
	{
		if(F==-1 && R==-1)      //if (F=0 and R=4) or R+1=F

		{
			++F;
			++R;
			arr[F]=suraj;
		}
		else if(F==0 && R<arr.length-1)
		{
			
				R++;
				arr[R]=suraj;
			
			if(F>0)
			{
				R++;
				arr[R]=suraj;
			}
		}
		else
		{
			System.out.println("que is full"+60);
		}
		
		

	}
	
	/*	if(F==0 && R==arr.length-1) 
		{
			System.out.println("Full");
		}
		else 
		{
			if(F==0 && R==0) 
			{
				arr[F]=value;
				F--;

			}else
			{
				if(F==0 && R<arr.length-1)
				{
					R=R+1;
					int i=R;
					while(i<F) {
						arr[i]=arr[i-1];
						i--;
					}
				
				arr[F]=value;
			}
			else 
			{
				F=F-1;
				arr[F]=value;
			}
		}
	}
}*/
	public void InsertfromR(Student suraj)
	{
		if(F==-1)
			F++;
		if(F==0 && R==arr.length-1)      //if (F=0 and R=4) or R+1=F

		{
			System.out.println("Full");          
		}
		else
		{
			if(F==0 && R==arr.length-1) {
				F=F-1;
				int i=F;
				while(i<R)
				{
					arr[i]=arr[i+1];
					i++;
				}
				arr[R]=suraj;
			}

			else 
			{
				R=R+1;
				arr[R]=suraj;
			}
			}
	}
	public int RemoveFromR()
	{
		int value;
		value =arr[R];
		R--;
		return value;
	}
	public int RemoveFromF()
	{
		int value;
		F++;
		value =arr[F];
		return value;

	}

	public String toString()
	{
		String str="";
		for(int i=F;i<=R;i++)
		{
			str +=arr[i]+",";
		}
		return str;
	}

}
