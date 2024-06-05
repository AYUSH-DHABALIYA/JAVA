// Write a Java program to update specific array element by given element
package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Qurstion_50 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("ayush"); // name list
		name.add("jay");
		name.add("karan");
		name.add("sahil");
		name.add("ayush");
		
		System.out.println("Student list : " + name);
		
		
		System.out.println("Enter name you want to change : ");
	    String n = sc.next();
	    
	    System.out.println("Enter index of name list : ");
	    int in = sc.nextInt();
	    
	    System.out.println("Enter new name to add to list : ");
	    String n2 = sc.next();
	    
	   ;
	    
	    name.set(4, n2); // update name in array list
	    
	    System.out.println("Updated list : " + name);
		
		
		

	}

}
