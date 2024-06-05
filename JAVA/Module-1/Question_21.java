// Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
package Assignment;

public class Question_21 {
	
		public void number(int n, char ch) // creating method of number, first sequence is integer and char
		{
			System.out.println("The number and character is " + n + ch );
		}
		
		public void number(char ch, int n)// creating method of number, second sequence is char and integer
		{
			System.out.println("The character and number is " + ch + n);
		}

	public static void main(String[] args) {
	
		Question_21 obj = new Question_21(); // object creation
		
		obj.number(10, 'x'); // passing parameters
		obj.number('y', 20);
	}

}
