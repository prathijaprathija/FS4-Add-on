package session7;

public class ThrowEx {
	public static int dividenumber(int m,int n)throws
	ArithmeticException, ArrayIndexOutOfBoundsException {
		int div =m/n;
		
		//String[] name= {"java","python","node"};
		//System.out.println(name[3]);
		System.out.println("Enterb the value m:"+m);
		System.out.println("Enterb the value n:"+n);
		return div;
		
	}
	public static void  main (String[] args) {
		//ThrowEx te=new ThrowEX();
		try {
			System.out.println(dividenumber(45,0));
			
		}catch(ArithmeticException e){
			System.out.println("\n Number Cannot be divide by 0");
		}catch( ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array index is out of bound");
		}
		
	}

}
