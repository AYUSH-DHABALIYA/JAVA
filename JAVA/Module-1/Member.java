/* Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary */
package Assignment;

public class Member {
	
	
	public void data_member() // creating data function
	{
		String  Name,Address; // creating data members
		int Age, Phone_number;
		
		
		System.out.println("Name is john" + "\nAddress is America" + "\nAge is 23" + "\nPhone_number is 9998887776");
		
	}
	public void print_salary() 
	{
		Double Salary;
		System.out.println("\nSalary is 1000$");
	}
	

	public static void main(String[] args) {
		
		Member obj = new Member(); // object creation
		obj.data_member();
		obj.print_salary();// calling function

	}

}
