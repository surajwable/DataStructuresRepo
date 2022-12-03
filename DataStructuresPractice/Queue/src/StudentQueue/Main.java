package StudentQueue;

public class Main {

	public static void main(String[] args) {
		Student stud1=new Student();  //no-args
		System.out.println(stud1);
		Student stud2=new Student (16,"aaaaa",76.56f);
		stud2.display();
		Student stud2=new Student();
		stud2.setValues(11,"Anisha",75.45f);
		stud2.display();
		Student stud3=new Student();
		stud3.setValues(12,"Arjun",75.45f);
		stud3.display();
		
	}

}


