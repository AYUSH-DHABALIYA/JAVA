// Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 an$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes
package Assignment;

abstract class Bank // creating abstract class 
{
	public abstract int getBalance();
}

class BankA extends Bank  // inherit class 
{
	public int balance = 100; // creating data member
	
	public int getBalance() {return balance;}
	
}

class BankB extends Bank 
{
	public int balance = 150;
	
	public int getBalance() {return balance;}
	
}

class BankC extends Bank 
{
	public int balance = 200;
	
	public int getBalance() {return balance;}
	
}

  public class Main {
	  
	public static void main(String[] args) {
		
		BankA a = new BankA(); // object creation
		BankB b = new BankB();
		BankC c = new BankC();
		
		System.out.println("$" + a.getBalance() + " is deposited in bank A");// calling method
		System.out.println("$" + b.getBalance() + " is deposited in bank B");
		System.out.println("$" + c.getBalance() + " is deposited in bank C");
	}

}
