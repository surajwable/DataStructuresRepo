package GetterPractice;

public class Student {

	public int rollno;
	public String name;
	public int age;
		
	Student()
	{
		rollno=12;
		name="akshay";
		age=24;
	}
	
	public void setvalues(int r,String nm,int a)
	{
		rollno=r;
		name=nm;
		age=a;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String tostring()
	{
		String str= +rollno+" "+name+ " " +age+ " " ;
		return str;
	}
	//public void display()
	
		
	
	
	
	
	
	
}
