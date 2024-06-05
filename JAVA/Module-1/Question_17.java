// W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red?
package Assignment;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Red is my favorite color";
		String str2 = "Orange is also my favorite color";
		
		
		if (str.startsWith(str2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
