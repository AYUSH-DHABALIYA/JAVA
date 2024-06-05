//Write a Java program to sort a given array list
package Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question_53 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(70);
		num.add(65);
		num.add(0);
		num.add(40);
		num.add(87);
		
		System.out.println("array list before sorting " + num);
		
		num.sort(null);
		System.out.println("after sorting array list " + num);
		
		
		
		

	}

}
