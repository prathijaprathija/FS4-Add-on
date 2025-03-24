package jp;

public class Employee1 implements Company  {
	@Override
	public void role() {
		System.out.println("Full Stack Developer");
	}
    public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.role();
	}
}
