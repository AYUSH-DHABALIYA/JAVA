// Write a Java program to compare two sets and retain elements which are same on both sets.
package Assignment;

import java.util.HashSet;

public class Question_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> num = new HashSet<Integer>();
		HashSet<Integer> num_2 = new HashSet<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("List 1 " + num);
		
		num_2.add(2);
		num_2.add(4);
		num_2.add(5);
		num_2.add(6);
		num_2.add(7);
		
		System.out.println("List 2" + num_2);
		
		num.retainAll(num_2);
		
		System.out.println("common list is " + num);
		
		
	}

}
