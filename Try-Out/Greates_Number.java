package jp;

import java.util.Scanner;

public class Greates_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value for A:");
		int a=sc.nextInt();
		
		System.out.println("enter the value for B:");
		int b=sc.nextInt();
		
		System.out.println("enter the value for C:");
		int c=sc.nextInt();
		
		if (a>b) {
			System.out.println("A greates number");
			
		}else if(b>c) {
			System.out.println("B greates number");
		}else {
			System.out.println("c greates number");
		}
	}

}
