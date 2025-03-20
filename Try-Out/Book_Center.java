package jp;


import java.util.Scanner;


public class Book_Center {
public static void main(String[] args) {
	

		Scanner src=new Scanner(System.in);
	
		
		System.out.println("Enter the book serila number:");
		int cho=src.nextInt();
		
	    switch (cho) {
		case 1: {
			System.out.println("Book Name:Karmayoddha Granth");
			System.out.println("Author Name:Amit Shah");
			System.out.println("this book was publised in year 1887");
			break;
			
		}
		case 2: {
			System.out.println("Book Name:Relentless");
			System.out.println("Author Name:Yashwant Sinha");
			System.out.println("this book was publised in year 1884");
			break;
			
		}
		case 3: {
			System.out.println("Book Name:A Commentary and Digest on The Air,");
			System.out.println("Author Name:Apoorva Kumar Singh");
			System.out.println("this book was publised in year 1893");
			break;
			
		}
		case 4: {
			System.out.println("Book Name:My Encounters in Parliament");
			System.out.println("Author Name:Bhalchandra Mungekar");
			System.out.println("this book was publised in year 1876");
			break;
			
		}
		case 5: {
			System.out.println("Book Name:I am No Messiah");
			System.out.println("Author Name:Meena Iyer");
		
			System.out.println("this book was publised in year 1899");
			break;
			
		}
		case 6: {
			System.out.println("Book Name:Oh Mizoram");
			System.out.println("Author Name:PS Sreedharan Pillai");
			System.out.println("this book was publised in year 1894");
			break;
			
		}
		default:
			System.out.println("invalid serila number try correct serila number");
		}
		
		}
	}
