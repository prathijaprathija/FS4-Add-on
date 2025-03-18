package jp;
import java.util.Scanner;
public class LadderElseif {
public static void main(String[] args) {
	Scanner se=new Scanner(System.in);
	System.out.println("Enter ticket price:");
	int price=se.nextInt();
	
	if (price>=80 && price<=100) {
		System.out.println("seat from 1 to 30");
	}else if (price>=100 && price<=250) {
		System.out.println("seat from 31 to 60");
	}else if (price>=250 && price<=500) {
		System.out.println("seat from 61 to 90 ");
		
	}
	else {
		System.out.println("no seating");
	 }
	}
}
