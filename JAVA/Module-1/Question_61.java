// Write a Java program to reverse elements in an array list
package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question_61 {

	public static void main(String[] args) {

		ArrayList<Integer> number  = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		
		System.out.println("Increasing oreder " + number);
		
		Collections.reverse(number);
		
		System.out.println("Decreasing order " + number);

	}

}
