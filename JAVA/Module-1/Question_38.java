/*• W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid*/
package Assignment;

import java.util.Scanner;

public class Question_38 {
	
	public void vote(int age) // data function
	{
		if (age < 18)
		{
			throw new ArithmeticException("Sorry you are not eligible to not valid"); // Throw exception
		}
		else 
		{
			System.out.println("Welcome to vote");
		}
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		Question_38 obj = new  Question_38();
		obj.vote(age);
		sc.close();
		

	}

}
