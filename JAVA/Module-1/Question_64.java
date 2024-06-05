// Write a Java program of swap two elements in an array list.
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_64 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(101);
		num.add(102);
		num.add(103);
		num.add(104);
		num.add(105);
		
		System.out.println("Before swapping " + num);
		
		System.out.println("Enter two index to swap the element : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// swapping the element
		Collections.swap(num, a, b);
		
		System.out.println("After swapping " + num);
		
		
		
		

	}

}
