// Write a Java program to shuffle elements in an array list.
package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question_55 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//add the data
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		
		
		//before shuffle
		System.out.println("Before Shuffle list is : " + list);
		
		//after shuffle 
		Collections.shuffle(list);
		System.out.println("After Shuffle list is : " + list);
	
	}
}
