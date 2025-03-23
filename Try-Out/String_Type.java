package jp;

import java.util.Scanner;

public class String_Type {
	public static void main(String[] args) {
		Scanner the=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=the.next();
		
		StringBuilder se=new StringBuilder(str);
	     se.reverse();
	     System.out.println("Reverse The String:"+se);
	     the.nextLine();
	     System.out.println("Enter The String:");
			String str2=the.nextLine();
	      StringBuilder sc=new StringBuilder(str2);
	     sc.repeat(sc, 5);
	    System.out.println("Repeat:\n"+sc);
	     
		/*System.out.println("Enter the String:");
		String str=the.next();*/
		
		char[] ch= {'j','a','v','a'};
		char [] sh= {'p','r','o','g','r','a','m'};
		System.out.println(ch[1]);
		System.out.println(sh);
		
		
		
		
}
}
