package array;

import java.util.*;
public class ArrayPractice {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size :");
		int size=sc.nextInt();
		int []a=new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element:");
			int ele=sc.nextInt();
			a[i]=ele;
		}
		System.out.println(Arrays.toString(a));
	}
}
