// Write a Java program to print all the elements of an Array List using the position of the elements.
package Assignment;

import java.util.ArrayList;

public class Question_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Java");
		name.add("C");
		name.add("C++");
		name.add("python");
		name.add("React");
		
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		System.out.println(name.get(2));
		System.out.println(name.get(3));
		System.out.println(name.get(4));
	}

}
