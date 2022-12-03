	package BST;
	
	public class Employee {
	
		private int empid;
		private String name;
		private int payment;
		private char gender;
	
		public Employee()
		{
			empid=100;
			name="Suraj";
			payment=80000;
			gender='m';
		}
	
		public Employee(int empid,String name,int payment,char gender)
		{
			this.empid=empid;
			this.name=name;
			this.payment=payment;
		}
	
		public int getEmpid() {
			return empid;
		}
	
		public void setEmpid(int empid) {
			this.empid = empid;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public int getPayment() {
			return payment;
		}
	
		public void setPayment(int payment) {
			this.payment = payment;
		}
	
		public char getGender() {
			return gender;
		}
	
		public void setGender(char gender) {
			this.gender = gender;
		}
	
		public String toString() {
			return "Employee [empid=" + empid+ ", name=" + name + ", payment=" + payment + ", gender=" + gender + "]";
		}
	
	
	}