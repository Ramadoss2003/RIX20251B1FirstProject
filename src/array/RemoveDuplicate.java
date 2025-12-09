package array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[];
		int []a= {4,3,5,5,2,7,8,3};
		int count=0;
		int dup=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;
			}
			}
		}
		int []res=new int[a.length-count];
		for(int i=0;i<res.length;i++) {
			if(res[i]!=Integer.MAX_VALUE) {
				res[i]=a[i];
			}else {
				continue;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
