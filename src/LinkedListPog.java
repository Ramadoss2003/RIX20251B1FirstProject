import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPog {

	public static void main(String[] args) {
		int a[] = {3,4,2,15,7,8,9,11,45,22,21};
		
		LinkedList<Integer> res = new LinkedList<Integer>();
		
		for(int num : a) {
			if(num%2==1) {
				res.addFirst(num);
			}else if(num%2==0){
				res.addLast(num);
			}
		}
		Collections.sort(res);
		System.out.println(res);
		
//		for(int num : a) {
//			if(num%2==1) {
//				while(res.contains(num)) {
//					res.add(num);
//				}
//			}else if(num%2==0) {
//				while(res.contains(num)) {
//					res.add(num);
//				}
//			}
//		}
//		System.out.println(res);
	}
}
