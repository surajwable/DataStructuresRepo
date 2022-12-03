package LLPractice;

public class Employee {
	
	private int empid;
	private String name;
	private float salary;
	
	public Employee()
	{
		empid=100;
		name="suraj";
		salary=10000f;
	}
	
	public Employee(int empid,String name,float salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}

	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
