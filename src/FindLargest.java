import java.util.Arrays;

public class FindLargest {

	public static void main(String[] args) {
		int a[]= {3,7,9,4,5,6};
		
		int max=a[0];
		
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
				if(max < a[i]) {
					max = a[i];
				}
		}
		System.out.println("The maximum number is :"+max);
		Arrays.sort(a);
		System.out.println(a[n-2]);
	}
}
