package jp;

public class Calculator {

	//By changing the number of arguments
	public int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	public int add(int a,int b,int c) {
		System.out.println(a*b*c);
		return a*b*c;
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(3, 40);
		cal.add(2, 3, 6);
	}
}
