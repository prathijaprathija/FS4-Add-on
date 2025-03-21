package jp;

import java.util.Scanner;

public class String_Method {
public static void main(String[] args) {
	String si1="Java Program";
	//1.length
	System.out.println(si1.length());
	
    //2.equals()
	//equalIgnoreCase()
	Scanner sew=new Scanner(System.in);
	
	/*System.out.println("Enter the Username:");
	String us=sew.nextLine();
	
	System.out.println("Enter the Password:");
	String ps=sew.next();
	
	if (us.equals("admin")&&ps.equalsIgnoreCase("admin@123")) {
		System.out.println("Succes");
	}else {
		System.out.println("Error 404 found");
	}*/
	
	//==
	String s4="Kathi";
	String s3="Kathi";
	System.out.println(s4==s3);
	
	String name=new String("Kathi");
	String name1=new String ("Kathi");
	System.out.println(name==name1);
	
	
	//compareTo
	//s1>s2 -->positive number
	//s1<s2 -->negative number
	//s1==s2 -->0
	String s2="heuits";
	String s1="hello";
	System.out.println(s2.compareTo(s1));
			
	//concat()
	String str1 ="Static";
	String str2 =new String("Program");
	System.out.println(str1.concat(str2));
	
	//toCharArray
	String str7="welcom to Java";
	System.out.println("value of method:");
	//char [] ch=str7.toCharArray();
	
	System.out.println(str7.toCharArray());
	
	//subString()
	System.out.println(str7.substring(5));
	System.out.println(str7.substring(0, 2));
	
	//inter 
	String clg ="Kgisl";
	String clg2= new String("Kgisl");
	String str0= clg2.intern();
	
	System.out.println(clg==str0);
	
}
}
