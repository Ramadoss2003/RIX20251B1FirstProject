package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		mylist.add("Ramadoss");
		mylist.add(45);
		mylist.add('R');
		
		mylist.add(3, 300000);
		
		ArrayList mylist1 = new ArrayList();
		mylist1.add("Sita");
		mylist1.add("Kannamma");
		
		mylist.addAll(mylist1);
		mylist.addFirst("Hi");
		mylist.addLast("bye");
		
		System.out.println(mylist.contains(45));
		System.out.println(mylist.get(3));
		System.out.println(mylist.set(7, "Takecare"));
		
		for(Object obj : mylist) {
			System.out.println(obj);
		}
		for(Object obj1 : mylist1) {
			System.out.println(obj1);
		}
		
		System.out.println(mylist);
	}
}
