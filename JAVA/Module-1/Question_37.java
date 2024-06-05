/*
  W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument and perform the division operation and handle Arithmetic
O/P-
Exception in thread main java. Lang. Arithmetic Exception:/ by zero
 */
package Assignment;

import java.util.Scanner;

public class Question_37 {
	
	Scanner sc = new Scanner(System.in);
	
	public Question_37()
	{
		int num1, num2, num3;
		
		
		try
		{
			System.out.println("enter the first number : ");
			 num1 = sc.nextInt();
			
			System.out.println("enter the second number : ");
			 num2 = sc.nextInt();
			
			num3 = num1/num2;
			
			System.out.println(num3);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	
		
	}
	
	public static void main(String[] args) {
		
		new Question_37();
	}

}
