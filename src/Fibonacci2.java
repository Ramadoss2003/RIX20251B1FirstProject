
public class Fibonacci2 {

	    public static void main(String[] args) {
	        int count = 13;

	        int n1 = 0;
	        int n2 = 1;

//	        System.out.print("Fibonacci Series (first " + count + " terms): ");
	        if (count >= 1) {
	            System.out.print(n1);
	        }
	        if (count >= 2) {
	            System.out.print(" " + n2);
	        }

	        for (int i = 2; i < count; i++) {
	            int n3 = n1 + n2;
	            System.out.print(" " + n3);
	            n1 = n2;
	            n2 = n3;
	        }
	        System.out.println();
	    }
}
