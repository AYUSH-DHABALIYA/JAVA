import java.util.Scanner;

/*Write a program to print the number in reverse order.
*/import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        
       
        
        
        int reversed = 0;
        int originalNumber = number; 
        
        
        for (int i = number; number != 0; number /= 10) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
        }
        
        // Print the reversed number
        System.out.println("Reversed Number of " + originalNumber + " is: " + reversed);
    }
}

