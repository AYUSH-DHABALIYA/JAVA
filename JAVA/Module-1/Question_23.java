// Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class

package Assignment;

class Parent_1 { // creating parent class 
	 void parent() {
		 System.out.println("This is  a parent class");
	 }
}

class Child  extends Parent_1{// creating child class and inherit parent class 
	void child() {
		System.out.println("This is a child class");
	}
}

public class Question_23 {
	
	
	public static void main(String[] args) {
		
		Parent_1 pr = new Parent_1(); // object creation of both class
		Child ch = new Child();
		
		pr.parent(); // calling parent class method
		ch.child(); // calling child class method
		ch.parent(); // calling parent class method by child class object
	}

}


