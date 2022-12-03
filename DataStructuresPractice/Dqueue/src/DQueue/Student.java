package DQueue;

public class Student {
	
	private String name;
	private int age;
	private char gender;
	
	public Student(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	
}
