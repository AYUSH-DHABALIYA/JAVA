// Write a Java program to convert a hash set to a List/Array List.
package Assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Question_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		num.add(101);
		num.add(102);
		num.add(103);
		num.add(104);
		num.add(105);
		
		System.out.println("This is Hashset " + num);
		
		ArrayList<Integer> num_2 = new ArrayList<Integer>(num);
		
		System.out.println("This is array list " + num_2);
		

	}

}
