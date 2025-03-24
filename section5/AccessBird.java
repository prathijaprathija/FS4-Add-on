package jp;

public class AccessBird extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird Flys.....");
		
	}
	public static void main(String[] args) {
		AccessBird bf=new AccessBird();
		bf.eat();
		bf.fly();
	}

}
