package array;

import java.util.*;
public class DetailsOfEmployee {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter count of the Employees :");
		int count = sc.nextInt();
		
		Employee emps[]=new Employee[count];
		
		for(int i=0; i<emps.length; i++) {
			System.out.println("Enter empno,name and salary");
			int empno=sc.nextInt();
			String name= sc.next();
			long salary= sc.nextLong();
			
			emps[i]=new Employee();
			emps[i].setEmpno(empno);
			emps[i].setEmpname(name);
			emps[i].setSalary(salary);
		}
		
		for(Employee e : emps) {
			System.out.println(e.getEmpno()+" "+e.getEmpname()+" "+e.getSalary());
		}
	}
}
