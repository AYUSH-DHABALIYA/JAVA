/*Write a program to find the simple Interest.
*/public class SimpleIntrest
{
	public static void main(String[] args)
	{
		double si;
		double principal = 50, rate = 30, time = 10;
		
		si = (principal + rate + time) / 100;
		
		System.out.println("Simple intrest : " + si + "%");
	}
}
