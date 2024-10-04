
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        int sum = 0;
        
       
        number = Math.abs(number);
        
       
        while (number != 0) {
            int digit = number % 10; 
            sum += digit; 
            number /= 10; 
        }
        
        // Print the result
        System.out.println("Sum of the digits is: " + sum);
    }
}
