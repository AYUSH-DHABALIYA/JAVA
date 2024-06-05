// Write a Java program to get a collection view of the values contained in this map
package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class Question_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(101, "John");
		names.put(102, "Micheal");
		names.put(103, "Liza");
		names.put(104, "olivia");
		
		for (Map.Entry<Integer, String> entry : names.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue() );
			
		}
		

	}

}
