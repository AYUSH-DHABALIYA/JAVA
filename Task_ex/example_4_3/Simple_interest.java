//Write a program to find the simple interest
package example_4_3;

public class Simple_interest {

	public static void main(String[] args) {
		
		double si, principal_amount, interest_rate,time;
		
		principal_amount = 50000.0;// amount
		interest_rate = 7.0;// rate of interest
		time = 3.0;// time in years

		si = (principal_amount*interest_rate*time) / 100;
		
		System.out.println("The simple interest of rs.5000 in 3 years with interest rate of 7.0% is : " + si);
	}

}
