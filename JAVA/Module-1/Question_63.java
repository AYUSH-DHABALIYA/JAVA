// Write a Java program to compare two array lists.
package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question_63 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list_1 = new ArrayList<Integer>();
		
		ArrayList<Integer> list_2 = new ArrayList<Integer>();
		
		list_1.add(101);
		list_1.add(102);
		list_1.add(103);
		list_1.add(104);
		list_1.add(105);
		
		System.out.println(list_1);
		
		list_2.add(106);
		list_2.add(107);
		list_2.add(108);
		list_2.add(109);
		list_2.add(110);
		
		System.out.println(list_2);
		
		System.out.println(list_1.contains(list_2)); // comparing two list 

	}

}
