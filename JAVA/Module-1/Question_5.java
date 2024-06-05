//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
package Assignment;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, num = 0;
		int average;
		
		System.out.println("Enter any number : ");
		
		for (int i = 0; i < 5; i++) {
			
			Scanner sc = new Scanner(System.in);
			 num = sc.nextInt();
			
			sum +=num;	
		}
		System.out.println("The sum of number is : "+ sum );
		
		average = sum/5;
		System.out.println("The average of sum is : " + average);
		
	}

}
