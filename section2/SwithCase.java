package jp;

import java.util.Scanner;

public class SwithCase {
	public static void main(String[] args) {
		Scanner su=new Scanner(System.in);
		System.out.println("Select an Operation :");
		System.out.println("1.Additon");
		System.out.println("2.subraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
		System.out.println("enter your choice:");
		int cho=su.nextInt();
		
		System.out.println("enter the first number:");
		double num1=su.nextDouble();
		
		System.out.println("enter the second number:");
		double num2=su.nextDouble();
	
		double result;
		
		switch (cho) {
		case 1: {
			result=num1+num2;
			System.out.println("Result"+result);
			result=num1/num2;
			break;
		}
		case 2:{
			result=num1-num2;
			System.out.println("Result"+result);
			break;
		}
		case 3:{
			result=num1*num2;
			System.out.println("Result"+result);
			break;
		}
		case 4:{
			if(num2 !=0) {
				result=num1/num2;
				System.out.println("Rresult"+result);
			}else {
				System.out.println("Error division by zero ");
			}
		}
		break;
		default:
			System.out.println("Invalid choice select the correct choice");
		}
	}



}
