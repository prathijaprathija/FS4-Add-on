package jp;

public class Cat extends Animal {
	void action() {
		System.out.println("cat play with mouse");
	}

	public static void main(String[] args) {
		Cat ct=new Cat();
		ct.eat();
		ct.action();
		
		Dog dg=new Dog();
		dg.eat();
		dg.sound();
	}
}
