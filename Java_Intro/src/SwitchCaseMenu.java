import java.util.Scanner;

public class SwitchCaseMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display the menu
        System.out.println("Simple Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        int choice;
        do {
            
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

               
                double result;

               
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result:" + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: "  + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please select a number between 1 and 5.");
            }
        } while (choice != 5);

       
    }
}
