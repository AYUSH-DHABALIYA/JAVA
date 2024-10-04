import java.util.Iterator;
import java.util.Scanner;

/* Write a program to calculate sum of 5 subjects & find the percentage.
*/import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        double[] marks = new double[5];
        double total = 0;
        
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            total += marks[i]; // Sum up the marks
        }
        
        
        double percentage = (total / 500) * 100;
        
        
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        
        
    }
}

