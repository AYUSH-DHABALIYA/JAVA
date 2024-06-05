// Write a Java program to associate the specified value with the specified key in a Hash Map.
package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Question_59 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "jignesh");
		hm.put(102, "jay");
		hm.put(103, "viraj");
		hm.put(104, "vyom");
		
		for(Map.Entry m : hm.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		

	}

}
