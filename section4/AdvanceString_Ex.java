package jp;

public class AdvanceString_Ex {
	public static void main(String[] args) {
		StringBuilder sd=new StringBuilder("hello");
		//append
		sd.append("world");
		System.out.println("After append:"+sd);
		
		//insert
		sd.insert(5,"^");
		System.out.println("After insert:"+sd);
		
		//replace
		sd.replace(6,11,"java");
		System.out.println("After replace:"+sd);
		
		//reverse
		sd.reverse();
		System.out.println("After reverse:"+sd);
		
	}

}
