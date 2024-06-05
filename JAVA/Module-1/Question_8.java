//• Write a Java program to count the letters, spaces, numbers and other characters of an input string.
package Assignment;

import java.util.Scanner;

public class Question_8 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        int letterCount = 0;
	        int spaceCount = 0;
	        int numberCount = 0;
	        int otherCount = 0;
	        
	        for (int i = 0; i < inputString.length(); i++) {
	            char ch = inputString.charAt(i);
	            if (Character.isLetter(ch)) {
	                letterCount++;
	            } else if (Character.isDigit(ch)) {
	                numberCount++;
	            } else if (ch == ' ') {
	                spaceCount++;
	            } else {
	                otherCount++;
	            }
	        }
	        
	        System.out.println("Letter count: " + letterCount);
	        System.out.println("Space count: " + spaceCount);
	        System.out.println("Number count: " + numberCount);
	        System.out.println("Other character count: " + otherCount);
	    }

}
