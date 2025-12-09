package queue;

import java.util.*;

class sortByName implements Comparator<Person>{
	
	@Override
	public int compare(Person o1, Person o2) {
//		return o1.getName().compareTo(o2.getName());
		return o1.getAge()-o2.getAge();
	}
}

public class DemoQ {

	public static void main(String[] args) {
//		Queue<String> que = new LinkedList<String>();
//		
//		que.add("Sachin");
//		que.add("Kholi");
//		que.offer("Dhoni");
//		
//		System.out.println(que);
//		
//		System.out.println(que.element());
//		
//		System.out.println(que.peek());
//		
//		System.out.println(que.poll());
//		
//		System.out.println(que.isEmpty());
//		
//		System.out.println(que.remove());
		
//		Queue<Integer> minque = new PriorityQueue<Integer>(Comparator.reverseOrder());
//		
//		minque.add(7);
//		minque.add(5);
//		minque.offer(11);
//		minque.offer(10);
//		
//		while(!(minque.isEmpty())) {
//			System.out.print(minque.poll()+" ");
//		}
		
		List<Person> arr = new ArrayList<Person>();
		Person p1 = new Person("Thilak", 25);
		Person p2 = new Person("Abinav", 45);
		Person p3 = new Person("Ramadoss", 22);
		Person p4 = new Person("Bala", 20);
		
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		
		Collections.sort(arr,new sortByName());
		System.out.println(arr);
		
	}
}
