package Linkedlist;

public class MainLinked {

	public static void main(String[] args) {


		LinkedList linkedlist=new LinkedList();
		linkedlist.insert(10);
		linkedlist.insert(20);
		linkedlist.insert(30);
		linkedlist.insert(40);
		System.out.println(linkedlist);
		//linkedlist.ReversePrint();
		linkedlist.deletebypos(2);
		//linkedlist.insertbypos(10,3);
		//System.out.println(linkedlist);
		//linkedlist.deletebypos(2);
		//System.out.println(linkedlist);
		//linkedlist.deleteAll();
		}
	}
