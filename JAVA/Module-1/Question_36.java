/*
 • W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}*/ 
package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_36 
{
	Question_36(int a, int b) // giving parameter in constructor
	{
		try  // using nested try catch
		{
			try
			{
				int[] num = new int[5];
				int div = a/b;
				num[5] = div;
			} 
			catch (IndexOutOfBoundsException e) // exception handler
			{
				System.out.println(e);
			}
		}
		catch (InputMismatchException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A :");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of B :");
		int b = sc.nextInt();
		
		
		new Question_36(a,b); // giving parameter
	}
	
}