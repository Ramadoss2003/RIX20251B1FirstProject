package array;

public class LargestNum {

	public static void main(String[] args) {
		int[] a = { 4, 9, 2, 4, 7, 8, 1, 0 };

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("maximum value is :" + max);
	}
}
