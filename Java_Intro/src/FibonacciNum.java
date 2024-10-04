
import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a number to print Fibonacci series up to: ");
        int limit = scanner.nextInt();
        
        int a = 0, b = 1;
        
        System.out.print("Fibonacci series up to " + ": ");
        
       
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
