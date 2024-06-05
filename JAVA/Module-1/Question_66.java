// • Write a Java program to convert a hash set to an array
package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Question_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> setDays = new HashSet<String>();
        setDays.add("Sunday");
        setDays.add("Monday");
        setDays.add("Tuesday");
        
        
        String[] strDays = setDays.toArray(new String[ setDays.size() ]);
        
        System.out.println( Arrays.toString(strDays) );
		
		

	}

}
