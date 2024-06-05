// Write a Java program to copy one array list into another.
package Assignment;

import java.util.ArrayList;


import java.util.Iterator;

public class Question_54 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		// first array list
 		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println(num);
		
		ArrayList num2 = num;
		// copy to another array list
		
		System.out.println(" after copy to  another list " + num2);
		
	}

}
