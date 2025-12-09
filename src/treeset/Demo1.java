package treeset;

import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		String str = "SPARTA";
		
		char []a = str.toCharArray();
		
		TreeSet<Character> tre = new TreeSet<Character>();
		
		for (Character character : a) {
			tre.add(character);
		}
		StringBuilder res = new StringBuilder();
		
		for (Character character : tre) {
			res.append(character);
		}
		System.out.println(res);		
	}
}
