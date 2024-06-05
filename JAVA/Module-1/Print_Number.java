/*  Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type*/
package Assignment;

public class Print_Number {
	
	public  void printn(int number) // creating methods of data types integer
	{
		System.out.println("The number is " + number);
	}
	
	public void printn(double number) // double 
	{
		System.out.println("The number is " + number);
	}
	
	public void printn(float number) // float
	{
		System.out.println("The number is " + number);
	}
	
	public void printn(Long ln) // long
	{
		System.out.println("The number is " + ln);
	}
	
	public void printn(String str)// string
	{
		System.out.println("The string is " + str);
	}


	public static void main(String[] args) {
		
		Print_Number pn = new Print_Number(); // creating object 
		
			pn.printn(100); // passing parameter
			pn.printn(100.0);
			pn.printn(100.0);
			pn.printn(100.0);
			pn.printn("100");
			
			}

}
