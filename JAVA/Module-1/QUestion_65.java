// Write a Java program to join two array lists
package Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QUestion_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l2.add(6);
		l2.add(7);
		l2.add(8);
		l2.add(9);
		l2.add(10);
		
		System.out.println("first list " + l1);
		System.out.println("second list" + l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		

	}

}
