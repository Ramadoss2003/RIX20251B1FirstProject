package queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(10);
		que.add(20);
		que.offer(30);
		
		System.out.println("Original queue :"+que);
		que.poll();
		System.out.println("After removing queue :"+que);
	}

}
