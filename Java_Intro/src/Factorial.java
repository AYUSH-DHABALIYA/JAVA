import java.util.Scanner;

/*write a program you have to find the factorial of given number.
5!=5*4*3*2*1
*/
public class Factorial 
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();
	        
	        long factorial = 1; 
	        
	       
	        for (int i = 1; i <= number; i++) {
	            factorial *= i; 
	        }
	        
	        
	        System.out.println(number + " = " + factorial);
	}
}
