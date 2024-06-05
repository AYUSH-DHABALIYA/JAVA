/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/
package Assignment;


public class Question_35 {

	public static void main(String[] args) 
	{
		
		 try {
	            int a[] = new int[5];
	            a[5] = 30 / 0; // This line will throw both ArrayIndexOutOfBoundsException and ArithmeticException
	        } catch (ArrayIndexOutOfBoundsException e) {  // exception handler for bounds of array
	            System.out.println("Array index is out of bounds.");
	        } catch (ArithmeticException e) { // exception handler for arithmetic
	            System.out.println("Cannot divide by zero.");
	        }
		
		 
	}

}
