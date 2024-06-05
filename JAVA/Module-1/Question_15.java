//  W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
package Assignment;

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "topsint.com";
		
		System.out.println("Enter a string : ");
		String str2 = sc.next();
		
		if (str.contentEquals(str2)) { // comparing two strings
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
