package jp;

public class AccessFoodMenu implements VegItems, NonvegItems{

	@Override
	public void fry() {
		System.out.println("chicken fry,Prawn fry,fish fry etc.....");
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken gravy,fish gravy,Mutton gravy etc.....");
		
	}

	@Override
	public void breakfast() {
		System.out.println("Idly, dosa, pongal etc....");
		
	}

	@Override
	public void Lunch() {
		System.out.println("Tomato rice,Meals etc.....");
		
	}
public static void main(String[] args) {
	AccessFoodMenu me=new AccessFoodMenu();
	me.breakfast();
	me.Lunch();
	me.fry();
	me.gravy();
}
}
