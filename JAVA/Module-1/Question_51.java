// Write a Java program to remove the third element from an array list
package Assignment;

import java.util.ArrayList;

public class Question_51 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("C++");
		list.add("React");
		list.add(".Net");
		
		System.out.println(list);
		
		
		System.out.println("This list contains duplicate value on 3rd index.");
		
		// now removing 3rd element from the list 
		
		list.remove(3);
		System.out.println("after update :" + list);
		
	}

}
