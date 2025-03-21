package jp;


public class Constructor {

	

	public Constructor() {

		System.out.println("Default Constructor");

	}

	

	public Constructor(String name, String age) {

		System.out.println("Name: "+name);

		System.out.println("Age: "+age);

		System.out.println("Parameterized Constructor");

	}

	// Bottom of Approach

	public int sum(int a, int b) {

		int res = a + b;

		return res;

	}

	

	public static void main(String[] args) {

		Constructor cx = new Constructor();

		Constructor ce = new Constructor("abinaya", "18");

		
	}

	



}