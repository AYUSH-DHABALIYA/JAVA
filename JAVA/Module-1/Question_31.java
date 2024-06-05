/* Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.- 4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/
package Assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Question_31 {
	
	// Constructor of class 
	public Question_31() { 
		
		int factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the positve number to get the factorial number : ");
		int num = sc.nextInt();
		
		if (num<0) // number should be greater than zero 
		{
			System.out.println("Please enter number grater than zero.");	
		} 
		else
		{
			for (int i = 1; i <= num; i++) 
			{
				factorial *= i;
			}
		}
		System.out.println("The factorial of " + num + " is : " + factorial);
	}

	public static void main(String[] args)
	{
		new Question_31(); // calling Constructor

	}

}
