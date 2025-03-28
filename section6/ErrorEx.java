package session7;

import java.util.Scanner;

public class ErrorEx {
	public static void main(String[] args) {
	int age;	
	

	Scanner nc=new Scanner(System.in);
	System.out.println("Enter the age:");
	age=nc.nextInt();
	
	assert (age>0)&&(age<120);//
	System.out.println("The Entered age is:"+age);
}
}