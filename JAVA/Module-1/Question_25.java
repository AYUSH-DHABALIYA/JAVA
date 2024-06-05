// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
package Assignment;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}



public class Question_25 {
	
	public static void main(String[] args) {
		
		 Rectangle rectangle = new Rectangle(5, 4);
	        Square square = new Square(5);

	        System.out.println("Rectangle:");
	        System.out.println("Area: " + rectangle.area());
	        System.out.println("Perimeter: " + rectangle.perimeter());

	        System.out.println("\nSquare:");
	        System.out.println("Area: " + square.area());
	        System.out.println("Perimeter: " + square.perimeter());
		
	}

}
