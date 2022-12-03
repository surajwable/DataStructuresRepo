package BookStore;
import java.util.*;
public class Findmaxnum {

	public static void main(String[] args) {
		System.out.println("ENTER ANY THREE NUMBERS::");
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println( +num1+ " is max");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(+num2+ " is max");
		}
		else
		{
			System.out.println(+num3+" is max");
		}
		
		
	}

}
