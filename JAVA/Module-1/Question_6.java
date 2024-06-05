/* • Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10*/
package Assignment;


public class Question_6 {
	
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 4; i++) { // for loop for row
			for (int j = 1; j <=i ; j++) { // for loop for column
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
	}

}
