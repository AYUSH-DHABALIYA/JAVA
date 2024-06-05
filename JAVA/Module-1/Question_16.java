// W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
package Assignment;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "Java Excercise";
		
		System.out.println("Enter a string : ");
		String str2 = sc.nextLine();
		
		if (str.endsWith(str2)) 
		{
			System.out.println("True");
		} 
		else 
		{
			System.out.println("False");
		}
		
		
		
		
	}

}
