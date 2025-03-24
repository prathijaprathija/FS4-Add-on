package jp;

public class Access_Person {
	public static void main(String[] args) {
		//Original Person object
		Person orgperson=new Person("Prathija",19);
		
		//Copied Person object
		Person copperson=new Person(orgperson);//object dependency
		
		System.out.println("Original Person:");
		orgperson.displayInfo();
		
		System.out.println("Copied person:");
		copperson.displayInfo();
	}

}
