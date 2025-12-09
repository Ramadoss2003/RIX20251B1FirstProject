package treeset;

import java.util.Set;
import java.util.TreeSet;

public class DemoTree {

	public static void main(String[] args) {
		TreeSet<Integer> tre = new TreeSet<Integer>();
		
		tre.add(5);
		tre.add(8);
		tre.add(1);
		tre.add(8);
		tre.add(2);
//		tre.add(null);
		
		System.out.println(tre);
		System.out.println(tre.descendingSet());
		System.out.println(tre.ceiling(6)); // it will give the next element
		System.out.println(tre.floor(6)); // it will give the previous element
		System.out.println(tre.first()); // it will give the root element
		System.out.println(tre.last()); // it will give the last element
		
		System.out.println(tre.headSet(6)); // before what element are there we will get that elements
		System.out.println(tre.tailSet(6)); // after what are elements there we will get that elements
		System.out.println(tre.subSet(3, 7)); // between start to end it will give an element
//		tre.remove(1);
//		tre.clear();
//		System.out.println(tre);
		
	}
}
