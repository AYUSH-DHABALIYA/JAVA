// Write a Java program to count the number of key-value (size) mappings in a map.
package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Question_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> details = new HashMap<Integer, String>();
		
		details.put(1023, "samsung");
		details.put(5445, "apple");
		details.put(3042, "redmi");
		details.put(2340, "vivo");
		details.put(9806, "oppo");
		
		for (Map.Entry<Integer, String> entry : details.entrySet()) {
			
			System.out.println(entry.getKey() +" "+ entry.getValue());
			
		}
			
			System.out.println("the size of map is : " + details.size());
			
		
	}

}
