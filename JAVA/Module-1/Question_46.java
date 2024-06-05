//Write a Java program to create a new array list, add some colors (string) and print out the collection.
package Assignment;

import java.util.ArrayList;

public class Question_46 {

	public static void main(String[] args) 
	{
		ArrayList<String> ar =  new ArrayList<String>();  // array list collection
		
		ar.add("BMW"); // adding values
		ar.add("MERCEDES");
		ar.add("AUDI");
		ar.add("FORD");
		ar.add("BENTLEY");
		ar.add("PORSCHE");
		ar.add("ROLLS-ROYCE");
		ar.add("LAMBERGINI");
		ar.add("KONIESEGG");
		
		System.out.println("The car collection :" + ar);

		
		
	}

}
