package StackMenu;


public class employee {

	private int empId;
	private String name;
	private float salary;
	
	public employee()
	{
		empId=5013;
		name="Amit";
		salary=3400.00f;
		//System.out.println("In Constructor");
	}
	public employee(int e,String s,float sal)
	{
		empId=e;
		name=s;
		salary=sal;
		
	}
	
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println(empId+" "+name+" "+salary);
	}
	
	
	
}
