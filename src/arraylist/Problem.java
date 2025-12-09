package arraylist;

import java.util.ArrayList;

public class Problem {

//	public static void main(String[] args) {
//		String []fruits = {"Apple","Orange","Grape","Kiwi","Pineapple"};
//		
//		ArrayList list = new ArrayList();
//		
//		for(String str : fruits) {
//			list.add(str);
//		}
//		System.out.println(list.reversed());
//		reverse(fruits);
//	}
//	public static void reverse(String []fruits) {
//		ArrayList list1 = new ArrayList();
//		
//		for(String str : fruits) {
//			list1.add(str);
//		}
//
//		for(int i=list1.size()-1; i>=0; i--) {
//			System.out.println(list1.get(i));
//		}
//	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("100");
	
		int sum=0;
		for(Object obj : list) {
//			sum+=(int)obj;
			sum=sum+Integer.parseInt(obj.toString());
//			sum=sum+Integer.parseInt(obj+"");
		}
		System.out.println(sum);
	}
}
