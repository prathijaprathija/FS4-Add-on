package jp;
import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner csn=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=csn.nextInt();
		if (age>
		18) {
			System.out.println("eligible to vote");
		}
		
		else {
			System.out.println("not eligible to vote");
		}
		
	}

}
