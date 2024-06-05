//Write a Java program to retrieve an element (at a specified index) from a given array list.
package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Qurstion_49 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>(); // array 
		
		num.add(10); // adding values 
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		// retrieving values from array 
		System.out.println(num);
		
		System.out.println("Enter index you want to get : "); // retrieve element by getting user input
		int index = sc.nextInt();
		
		System.out.println("your index is " + index + " and your number is " + num.get(index));
		
		// retrieve element by providing index
//		System.out.println(num.get(1));
//		System.out.println(num.get(2));
//		System.out.println(num.get(4));
		

	}

}
