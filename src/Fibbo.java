
public class Fibbo {
	
	    public static void main(String[] args) {
	        int num1 = 0;
	        int num2 = 1;

	        System.out.print(num1 + " " + num2 + " "); 
	        while (true) {
	            num2 = num1 + num2; 
	            num1 = num2 - num1; 

	            if (num2 > 200) {
	                break;
	            }
	            System.out.print(num2 + " "); 
	        }
	    }
}

