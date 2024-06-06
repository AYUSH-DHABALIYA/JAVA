package example_63;

import java.util.Scanner;

public class Scannerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println(id + " " + name);

	}

}
