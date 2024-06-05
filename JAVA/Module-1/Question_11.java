//• Write a Java program to display the system time.
package Assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
	
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  // calling inbuilt mathod of local time
	   System.out.println(dtf.format(now));

	}

}
