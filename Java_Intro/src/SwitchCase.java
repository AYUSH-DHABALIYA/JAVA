import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a number (1-7) to display  day of the week: ");
        int dayNumber = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Use switch-case to determine the day of the week
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid number! Please enter a number between 1 and 7.";
                break;
        }
        
        // Print the result
        System.out.println(day);
    }
}
