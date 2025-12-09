import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> numbers = new LinkedList<String>();

		numbers.add("Two");
		numbers.add(0, "One");
		numbers.addFirst("Zero");
		numbers.addLast("Three");

		System.out.println(numbers.contains("Zero"));
		System.out.println(numbers.get(1));
		System.out.println(numbers.getFirst());
		System.out.println(numbers.getLast());
		System.out.println(numbers.indexOf("Three"));
		System.out.println(numbers);

	}
}