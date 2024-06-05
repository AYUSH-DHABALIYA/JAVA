// Write a Java program to check whether a map contains key-value mappings (empty) or not.
package Assignment;

import java.util.HashMap;

public class Question_68 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> kv = new HashMap<Integer, String>();
		
		kv.put(101, "a");
		kv.put(102, "b");
		kv.put(103, "c");
		kv.put(104, "d");
		kv.put(105, "e");
		
		if (kv.isEmpty() == true) 
		{
			System.out.println("This hashmap is empty");
		} 
		else
		{
			System.out.println("this hashmap is not empty");
		}

		
	}

}
