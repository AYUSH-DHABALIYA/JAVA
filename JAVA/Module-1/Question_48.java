// Write a Java program to insert an element into the array list at the first position
package Assignment;

import java.util.ArrayList;

public class Question_48 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		//Insert operation in list
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		fruits.add("Watermelon");
		
		//insert at first position
		
		fruits.add(0, "Kiwi");
		System.out.println(fruits);

	}

}
