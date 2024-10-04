/*Write a program to find out the max from given number
(E.g. No: -1562 Max number is 6 )*/
import java.util.Scanner;
public class MaxNumber
{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ask the user for input
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	       
	        number = Math.abs(number);
	        
	       
	        int maxDigit = -1;

	       
	        while (number != 0) {
	            int digit = number % 10; 
	            if (digit > maxDigit) {
	                maxDigit = digit;
	            }
	            number /= 10;
	        }
	        
	        // Print the result
	        System.out.println("Max digit is: " + maxDigit);
	    }
	}


