/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500*/
package Assignment;

import java.util.Scanner;

class InsufficientbalException extends Exception
{
	float amount;
	public InsufficientbalException(float amount) 
	{
		this.amount = amount;
	}
	
	float getAmount()
	{
		return amount;
	}
}

public class Question_39 
{
	
	public Question_39() throws Exception 
	{
		float balance, amount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your balance :");
		balance = sc.nextFloat();
		
		System.out.println("Enter amount you want to withdraw :");
		amount = sc.nextFloat();
		
		try
		{
			if (amount < balance) 
			{
				balance = balance - amount;
				System.out.println("Your transaction is successful" );
				System.out.println("Available balance " + balance);
			}
			else {
				float needs = amount - balance;
				throw new InsufficientbalException(needs);
			}
		} 
		catch (InsufficientbalException e) 
		{
			System.out.println("Sorry, insufficient balance, you need more " + e.getAmount() + "Rs. To perform this transaction.");
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		Question_39 obj = new Question_39();

	}

}
