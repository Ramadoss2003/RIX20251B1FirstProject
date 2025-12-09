import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1000);
		stack.push(2000);
		System.out.println("Peek element is :"+stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		stack.push(100);
		stack.push(200);
		System.out.println("Peek element is :"+stack.peek());
		while(!(stack.isEmpty())) {
			System.out.println(stack.pop());
		}
//		System.out.println(stack.peek());
	}
}
