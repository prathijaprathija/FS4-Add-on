package jp;

public class Employee2 implements Company {
	public void role() {
		System.out.println("Tester");
	}
public static void main(String[] args) {
	Employee2 e2=new Employee2();
	e2.role();
}
}
