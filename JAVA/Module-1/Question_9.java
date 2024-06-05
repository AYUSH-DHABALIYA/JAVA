// • Write a Java program to print the ASCII value of a given character.
package Assignment;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Please enter character : ");
		char ch = sc.next().charAt(0);// getting character
		
		 int asciValue = (int) ch;//count asci value for character

	        // Print the ASCII value
	        System.out.println("ASCII value of " + ch + " is: " + asciValue);

	}

}
