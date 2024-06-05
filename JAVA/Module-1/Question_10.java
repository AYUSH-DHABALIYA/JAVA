package Assignment;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);// creating scanner object
		
		System.out.println("Please enter number : ");
		int num = sc.nextInt();// getting value from user
		
		for (int i = 1; i <=3; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(num);
				
			}
			if (i == 3) {
				break;
			}
			System.out.print("+");
			
		}
	}

}
