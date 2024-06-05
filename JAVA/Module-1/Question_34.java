/*W.A.J. P to demonstrate try catch block,
 Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0*/
package Assignment;

public class Question_34 {

	public static void main(String[] args) {
		
		try
		{
			int data = 10/0;
			System.out.println(data);
		}
		catch (Exception e) // exception handler
		{
			System.out.println(e);
		}
		
		System.out.println("You can't divide zero with any number.");
		

	}

}
