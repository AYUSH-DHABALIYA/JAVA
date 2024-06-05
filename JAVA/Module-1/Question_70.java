// Write a Java program to replace the second element of an Array List with the specified element.
package Assignment;

import java.util.ArrayList;

public class Question_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("apple");
		name.add("banana");
		name.add("guavava");
		name.add("pineapple");
		
		System.out.println("list before changing the second element " + name);
		
		name.set(1, "grapes");
		
		System.out.println("after changing the second element " + name);
		
	}

}
