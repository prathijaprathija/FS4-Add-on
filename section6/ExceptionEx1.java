package jp;

public class ExceptionEx1 {
	String str2="6";
	
	public void name() {
		try {
			System.out.println("Tying to divide by 0...");
			int res=10/0;
			System.out.println("Result"+res);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("finally block executed......");
		}
	}
public static void main(String[] args) {
	ExceptionEx1 e1=new ExceptionEx1();
	e1.name();
	}
}
