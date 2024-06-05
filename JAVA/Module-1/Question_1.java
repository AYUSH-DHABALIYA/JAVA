//Write a Java program to Take three numbers from the user and print the greatest number.
package Assignment;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		System.out.println("Enter third number : ");
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("largest number is : " + a);
		}
		else if (b>a && b>c) {
			System.out.println("largest number is : " + b);
		}
		else {
			System.out.println("largest number is : " + c);
		}

	
		}
	
			
		}

