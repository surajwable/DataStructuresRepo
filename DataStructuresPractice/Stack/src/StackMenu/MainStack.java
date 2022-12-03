package StackMenu;

public class MainStack {

	public static void main(String[] args) {
		employee e1=new employee(100,"Suraj",5000.0f);
		employee e2=new employee(200,"Akshay",4000.0f);
		employee e3=new employee(300,"Pritam",3000.0f);
		employee e4=new employee(400,"Vaibhav",7000.0f);
		employee e5=new employee(500,"Akash",6000.0f);
		
		Stack st=new Stack();
		st.push(e1);
		//System.out.println(e2);
		st.push(e2);
		st.pop();
		//System.out.println(e2);
		st.push(e3);
		//System.out.println(e3);
		st.push(e4);
		System.out.println(e4);
		st.push(e5);
		System.out.println(e5);
		st.push(e5);
		
		st.pop();
		
		
		
		
	
		
		
	}

}
