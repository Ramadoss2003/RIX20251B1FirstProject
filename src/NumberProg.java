import java.util.*;
public class NumberProg {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter your number :");
		int num=sc.nextInt();
		
		int sum=0;
		int x=1;
		
		while(num>0) {
			sum+=num%10*x;
			num/=10;
			x*=2;
		}
		System.out.println(sum);
	}
}
