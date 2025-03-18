package jp;

import java.util.Scanner;

public class Nestedifelse {
public static void main(String[] args) {
	Scanner ns=new Scanner(System.in);
	System.out.println("enter the age");
	int ag=ns.nextInt();
	System.out.println("enter th wegith:");
	int wg=ns.nextInt();
	 if (ag>20) {
		 if (wg>50) {
			System.out.println("both age and weigth satisfied can donate blood ");
	
	
	 }else{
		System.out.println("under weigth cannot donate  blood");
		 }
	 }
	 else{
		System.out.println("under age to donate blood");
	}
}

}

