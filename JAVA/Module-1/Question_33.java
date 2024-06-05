/*
 Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks Grade
1-100
A
1-90
B
1-80
B
1-70
C
1-60
D
41-50 DD 
40 fail */
package Assignment;

import java.util.Scanner;

public class Question_33 {
	
	public void Marks() // create method
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt(); // user input
		
		if (marks > 90) 
		{
			System.out.println("Your grade is A");
		}
		else if (marks > 80) 
		{
			System.out.println("Your grade is B");
		}
		else if (marks > 70) 
		{
			System.out.println("Your grade is B");
		}
		else if (marks > 60) 
		{
			System.out.println("Your grade is C");
		}
		else if (marks > 50) 
		{
			System.out.println("Your grade is D");
		}
		else if (marks >= 40) 
		{
			System.out.println("Your grade is DD");
		}
		else  
		{
			System.out.println("You are fail, need improvement");
		}
	}

	public static void main(String[] args)
	{
		Question_33 mm = new Question_33();	// object creation
		mm.Marks();// function calling
		
	}

}
