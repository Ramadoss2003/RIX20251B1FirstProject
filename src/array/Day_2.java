package array;

import java.util.*;
public class Day_2 {
	
	public static void main(String[] args) {
		int a[]= {12,23,34,56};
		reverse(a);
	}
	public static void reverse(int []a) {
		int last=0;
		int first=0;
		for(int i=0; i<a.length; i++) {
			last=a[i]%10;
			first=a[i]/10;
		}
		int res[]=new int[4];
		for(int i=0;i<res.length;i++) {
			res[i]=last+first;
		}
		System.out.println(Arrays.toString(res));
	}
}
