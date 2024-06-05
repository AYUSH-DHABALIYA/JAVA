// Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.
package Assignment;

import java.util.Scanner;

public class Question_22 {

	Scanner sc = new Scanner(System.in);
	public void area(float length,  float width) // creating method with parameter of rectangle
	{
		float area; // data member
		
		area = length * width; // area of rectangle
		System.out.println("The area of rectangle is " + area);
	}
	
	public void area(float side) // method of square
	{
		float area;
		
		area = side * side; // area of square
		System.out.println("The area of square is " + area);
	}
	
	public static void main(String[] args) {
		
		Question_22 obj = new Question_22(); // object creation
		obj.area(10, 5); // calling function and passing parameter
		obj.area(20);
	}

}
