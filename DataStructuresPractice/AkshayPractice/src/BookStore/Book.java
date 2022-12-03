package BookStore;

public class Book {
	public int bookid;
	public String authorname;
	public double price;

	public void bookinfo1()
	{
		bookid=456;
		authorname="Suraj Wabale";
		price=1024.55;
	}
	
	public void displaybookinfo1()
	{
		System.out.println("THE BOOK ID IS "+bookid+" AND THE AUTHOR NAME"
				+ " IS "+authorname+" WITH PRICE IS "+price);
	}
	public void bookinfo2()
	{
		bookid=123;
		authorname="Pritam Patil";
		price=102.55;
	}
	
	public void displaybookinfo2()
	{
		System.out.println("THE BOOK ID IS "+bookid+" AND THE AUTHOR NAME"
				+ " IS "+authorname+" WITH PRICE IS "+price);
	}
	public void bookinfo3()
	{
		bookid=123;
		authorname="Akash Gole";
		price=104.55;
	}
	
	public void displaybookinfo3()
	{
		System.out.println("THE BOOK ID IS "+bookid+" AND THE AUTHOR NAME"
				+ " IS "+authorname+" WITH PRICE IS "+price);
	}
}
