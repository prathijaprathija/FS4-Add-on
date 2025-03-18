package jp;

import java.util.concurrent.ForkJoinPool;

public class Operators {
 public static void main(String[] args) {
	int a=5, b=3;
	
	//Arithmetic 
	System.out.println("addition:"+(a+b));
	System.out.println("subtraction :"+(a-b));
	System.out.println("multiplication:"+(a*b));
	System.out.println("division:"+(a/b));
	System.out.println("modul:"+(a%b));
	
	//Relation
	System.out.println("Equal to:"+(a==b));
	System.out.println("not Equal to:"+(a!=b));
	System.out.println("Greater than:"+(a>b));
	System.out.println("Less than:"+(a<=b));

	//Logical
	boolean condition1=true, condition2=false;
	System.out.println("logical AND:"+(condition1&&condition2));
	System.out.println("logical OR:"+(condition1||condition2));
	System.out.println("logical NOT:"+(!condition1));
	
	//unary
	System.out.println("unary negation:"+(~a));
	System.out.println("post Increment"+(++a));
	System.out.println("pre decrement"+(--b));
  int i=0;
 for(i=1;i<6;i++);{
	 System.out.println("print the value:"+i);
 }
	 
	 //Assignment
	 a+=5;//a=a+5
	 System.out.println("+="+a);
	 // ternary
	 String res =(a<b)? "a is greatern":"b is greater";//condition true than? if condition false :
	 System.out.println("Result:"+res);
     
 }
 }

