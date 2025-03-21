package jp;

public class ConstructorOverloadingEx {

	private String empname;
	private long empid;
	private String location;
	
	public ConstructorOverloadingEx(String empname, long empid, String location) {
		this.empname=empname;
		this.empid=empid;
		this.location=location;
		}
	public ConstructorOverloadingEx(String empname, String location) {
		this(empname,0,location);
		
	}
	public ConstructorOverloadingEx(String empname, int empid) {
		this(empname,23343,null);
	}
	public void displayifo() {
		System.out.println("Empname:"+this.empname);
		System.out.println("Empid:"+this.empid);
		System.out.println("Location:"+this.location);
	}
	public static void main(String[] args) {
		ConstructorOverloadingEx co=new ConstructorOverloadingEx("Prathija",232242,"comibator");
		ConstructorOverloadingEx cox=new ConstructorOverloadingEx("Anusha",45,"comibator");
		ConstructorOverloadingEx cot=new ConstructorOverloadingEx("kivya",24455,"coimbator");
		cox.displayifo();
		co.displayifo();
		cot.displayifo();
	}
}
