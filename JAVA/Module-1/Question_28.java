// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass
package Assignment;

 abstract class Parent // creating parent class 
{
	 void message()	 {}
}

class Child_1 extends Parent // creating first child class and inherit parent class
{
	 void message() // creating method
	 {
		 System.out.println("This is First sub-class");
	 }
	 
}

class Child_2 extends Parent //  creating second child class and inherit parent class
{
	 void message()
	 {
		 System.out.println("This is Second sub-class");
	 }
	 
}

public class Question_28 {

	public static void main(String[] args)
	{
		Child_1 obj_1 = new Child_1(); // object creation of both child class
		Child_2 obj_2 = new Child_2();
		
	
		obj_1.message(); //function calling
		obj_2.message();
	}

}
