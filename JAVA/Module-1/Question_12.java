// • Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
package Assignment;

public class Question_12 {

	public static void main(String[] args) {
		
		int num;
		for ( num = 1; num <= 100; num++) { // counting number from 1 to 100
			
			if (num %3 == 0 || num %5 == 0) { // put the modulo of 3 and 5 
				System.out.println(num);
			}
			
		}

	}

}
