
public class Employee {
	
	private int empno;
	private String empName;
	private int age;
	
	public Employee(int empno, String empName, int age) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", age=" + age + "]";
	}
	
}
