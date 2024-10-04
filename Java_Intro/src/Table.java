import java.util.Scanner;

/*write a program you have to print the table of given number.
*/public class Table 

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + "x" + i + "=" +(num*i));
		}
	}
}
