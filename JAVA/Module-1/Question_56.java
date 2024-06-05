//Write a Java program to append the specified element to the end of a hash set.
package Assignment;

import java.util.HashSet;

public class Question_56 {
	public static void main(String[] args) {
	
		HashSet<Integer> arr1 = new HashSet<Integer>();
		// first array

		arr1.add(50);
		arr1.add(20);
		arr1.add(40);
		arr1.add(10);
		arr1.add(30);
		
		System.out.println("array 1" + arr1);
		
		
		HashSet<Integer> arr2 = new HashSet<Integer>();
		// second array

		arr2.add(80);
		arr2.add(100);
		arr2.add(70);
		arr2.add(90);
		arr2.add(60);
		
		System.out.println("array 2" + arr2);
		
		arr1.addAll(arr2);
		System.out.println(arr1);
		
		
		
		
	}
}
