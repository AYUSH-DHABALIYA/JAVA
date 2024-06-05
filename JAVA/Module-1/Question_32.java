//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
package Assignment;

import java.util.Scanner;

abstract class Shape // creating abstract class 
{
	abstract  float RectangleArea(float length, float breadth); // creating abstract methods
	abstract  double CircleArea(double radius);
	abstract  float SquareArea(float side);
}

class Area extends Shape // inherit method
{
	
	@Override
	float RectangleArea(float length, float breadth) 
	{
		float area;
		area = length * breadth;
		
		System.out.println("The area of rectangle is : " + area);
		return area;
	}
	@Override
	double CircleArea(double radius)
	{
		double area, pi = 3.14; 
		
		area = pi * radius * radius; 
		
		System.out.println("The area of circle is : " + area);
		return area;
	}
	@Override
	float SquareArea(float side)
	{
		float area;
		area = side * side;
		
		System.out.println("The area of square is : " + area);
		return area;
	}
}

public class Question_32 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle : ");
		int len = sc.nextInt();
		
		System.out.println("Enter breadth of rectangle : ");
		int bth = sc.nextInt();
		
		System.out.println("Enter the radius of circle : ");
		int cir = sc.nextInt();
		
		System.out.println("Enter the side of square : ");
		int sqr = sc.nextInt();
		
		Area ar = new Area(); // object creation
		ar.RectangleArea(len, bth);
		ar.CircleArea(cir);
		ar.SquareArea(sqr);
		

		
	}

}
