// Write a Java program to increase the size of an array list.
package Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question_69 {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("apple");
		name.add("samsung");
		name.add("redmi");
		name.add("vivo");
		
		System.out.println("array list" + name);

		name.add("one plus");
		name.add("nothing");
		
		System.out.println("after increasing size of list " + name);
	}

}
