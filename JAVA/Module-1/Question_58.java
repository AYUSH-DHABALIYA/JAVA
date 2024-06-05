// Write a Java program to get the number of elements in a hash set
package Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> num = new HashSet<Integer>(); // creating HashSet
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println(num);
		 
		ArrayList<Integer> num2 = new ArrayList<Integer>(num); // converting hashset into arraylist
		
		System.out.println("Enter index number to get element : ");
		int n = sc.nextInt();
		
		System.out.println("your element is  " + num2.get(n));
		
		
	}

}
