// Write a Java program to search an element in an array list
package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> company_list = new ArrayList<String>();
		
		company_list.add("tcs");
		company_list.add("infosys");
		company_list.add("ibm");
		company_list.add("microsoft");
		company_list.add("google");
		company_list.add("accenture");
		company_list.add("hp");
		company_list.add("amazon");
		
		System.out.println(company_list);
		
		System.out.println("Search company name : ");
		String cn = sc.next();
		
		System.out.println("Your and company is " + cn + "at index " + company_list.indexOf(cn));
		

	}

}
