package jp;

import java.util.Scanner;

public class SwitchKm_Mm {
	public static void main(String[] args) {
		System.out.println("1.milemeter");
		System.out.println("2.kilometer");
		Scanner src=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int cho=src.nextInt();
			
       switch (cho) {
	case 1: {
		
		System.out.println("milemeter");
		break;
	}
	case 2:{
		System.out.println("kilometer");
	break;
	}
	default:
		System.out.println("invaild choice enter the correct choice");
	}
	}

}
