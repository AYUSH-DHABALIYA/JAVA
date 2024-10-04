import java.util.Scanner;

/*Write a Program to check the given number is Positive, Negative.
*/
public class NumberCheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		if (num > 0) 
		{
			System.out.println("Your number is postive number");
		}
		else
		{
			System.out.println("Your number is negative number");
		}
	
	}
}
