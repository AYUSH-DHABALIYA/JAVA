// Write a Java program to extract a portion of an array list.
package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_62 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		list.add(107);
		list.add(108);

		
		
		System.out.println(list);
		
		System.out.println("Enter  first index and last index of list  to get extract portion : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// list 
		System.out.println(list);
		// sub portion
		
		System.out.println(list.subList(a, b));

	}

}
