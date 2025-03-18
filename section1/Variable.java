package jp;

public class Variable {
	int a=25; //instance variable
	static int b=10; //static variable
	void display() {
		int d=60;
		System.out.println("method inside variable :"+d);
	}
	public static int print() {
		 int mark=20;
		return mark;
	}
public static void main(String[] args) {
	int c=13;//local variable
	
	Variable obj3 =new Variable();
	System.out.println("enter the a value :"+obj3.a);
	obj3.display();
	System.out.println(c);
	System.out.println(b);
	System.out.println(print());

	Var.show();
Var v2=new Var();
v2.students();
}
}
