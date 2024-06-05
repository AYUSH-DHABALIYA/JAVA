//  W.A.J.P to concatenate a given string to the end of another string.
package Assignment;

import java.util.Scanner;

public class Question_14 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner class 
		
		System.out.println("Enter first string :"); // first string
		String str = sc.next();
		
		System.out.println("Enter second string :"); // second string
		String str2 = sc.next();
		
		
		System.out.println(str.concat( " " + str2));} // combine two string using inbuilt function concat.
	
		
}
