import java.util.*;

public class LeapYear {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter your year :");
		int year = sc.nextInt();

		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("Leap year");
		} else if (year % 100 == 0) {
			System.out.println("Century");
		} else {
			System.out.println("Not a leap year");
		}
	}
}
