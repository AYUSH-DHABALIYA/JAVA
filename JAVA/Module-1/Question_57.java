// Write a Java program to iterate through all elements in a hash list
package Assignment;

import java.util.HashSet;

import java.util.Iterator;

public class Question_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("Ayush");
		name.add("Sahil");
		name.add("Dhrumil");
		name.add("Ajay");
		name.add("Gaurav");
		
		Iterator i = name.iterator();
		
		while (i.hasNext()) {
			
			System.out.println(i.next());

			
		}
		
	}

}
