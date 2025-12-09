class Node {

	Employee data;
	Node next;

	Node(Employee data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	public static void main(String[] args) {
//		Node head = new Node(100);
//		head.next = new Node(200);
//		head.next.next = new Node(300);
//
//		while (head != null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
		
		Employee emp = new Employee(1, "Rela", 25);
		Employee emp1 = new Employee(2, "vantz", 27);
		Employee emp2 = new Employee(3, "Trust", 35);
		
		Node head = new Node(emp);
		head.next = new Node(emp1);
		head.next.next = new Node(emp2);
		
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
