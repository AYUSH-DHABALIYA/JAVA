// Write a Java program that reads a positive integer and count the number of digits the number.
package Assignment;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		  
	        System.out.print("Input a positive integer: ");
	        int num = scanner.nextInt();// getting integer value
	        int count = 0;
	        
	        if (num ==0 || num <0) {// integer must be greater than zero 
				System.out.println("Please enter positive integer ");
			}
	        
	        
	        else {
	        while (num != 0) {
	            num /= 10; 
	            ++count;
	            
	        }
	        }

	        System.out.println("Number of digits: " + count);
	    }
	
	}


