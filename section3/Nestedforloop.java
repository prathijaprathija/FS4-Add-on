package jp;

import java.util.Scanner;

public class Nestedforloop {
	public static void main(String[] args) {
		/*or(int i = 0; i<=6; i++) {
			for(int j = 1; j<=5; j++){
				System.out.print(" "+i);
			}
			System.out.println();
	}*//*int num= 4; 
	
	for(int i=1;i<=num;i++) {
		
		for(int j=1;j<=num;j++) { 
			System.out.print("*");
		}
		System.out.println();
	}*/
		//diamond pattern
		Scanner src=new  Scanner(System.in);
		// No of row by use to give for pattern printing
		System.out.println("enter the  no of row :");
		
		int rw= src.nextInt();
		//top half of diamond 
		for(int i= 1;i<=rw;i++) {
			//leading spaces
			for(int j= i; j<rw;j++) {
				System.out.print(" ");
			}
			//print 
			for(int k=1;k<(2*i-1);k++) {
		System.out.print("*");
		}
			System.out.println();
		}
		//bottom half of diamond
		for(int i= rw-1;i>=1;i--) {
			//leading spaces
			for(int j= rw; j<i;j--) {
				System.out.print(" ");
			}
			//print 
			for(int k=1;k<(2*i-1);k++) {
		System.out.print("*");
		}
			System.out.println();
		}
}

}
