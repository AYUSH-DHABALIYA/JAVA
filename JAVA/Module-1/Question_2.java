//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
package Assignment;



import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0);
		
		if (ch !=0) {
		
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println("the character is vowel.");
				break;
				
			default:System.out.println("the character is consonent.");
			break;
		}
			
		}
		else {
			System.out.println("Error");
		}
	}

}
