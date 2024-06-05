//Write a Java program that takes a year from user and print whether that year is a leap year or not. B19. Write a program in Java to display the first 10 natural numbers using while loop.
package Assignment;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int num = sc.nextInt();
		if (num % 4 == 0 && num % 100 != 0 || num %400 == 0 )
	    {
	       System.out.println("This is leap year");
	    }
	    else
	    {
	       System.out.println("This is not leap year");
	    }
		
		}
	
		}

