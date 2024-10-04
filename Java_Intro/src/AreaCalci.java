import java.util.Scanner;

public class AreaCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Area Calculator");
        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Exit");

        int choice;
        do {
           
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            double area;

            if (choice == 1) {
                // Calculate area of Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle: " + area);
                
            } else if (choice == 2) {
                // Calculate area of Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle: " + area);
                
            } else if (choice == 3) {
                // Calculate area of Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of Circle: " + area);
                
            } else if (choice != 4) {
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
            }
        } while (choice != 4);

      
    }
}
