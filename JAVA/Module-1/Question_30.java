/* We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and float the percentage of marks for both the students.*/
package Assignment;
abstract class Marks // create an abstract class 
{
	public abstract float getPercentage();  // declaring abstract method 
}

class A extends Marks // inherit class 
{
	public float percentage, total;
	
	 // parameterized constructor
	A(float sub1, float sub2,float sub3)
	{
		total = sub1+sub2+sub3; // count percentage of individual student
		percentage = total/3;
	}
	public  float getPercentage() {return percentage;}
}

class B extends Marks
{
	public float percentage, total;
	B(float sub1, float sub2,float sub3, float sub4)
	{
		total = sub1+sub2+sub3+sub4;
		percentage = total/4;
	}
	public float getPercentage() {return percentage;}
}


 public class Question_30 {
	
	public static void main(String[] args)
			
	{
		// object creation
		A a = new A(67,78,64);
		B b = new B(56,78,65,59);
		
		System.out.println("The percentage of student A is " + a.getPercentage()); // calling method
		System.out.println("The percentage of student B is " + b.getPercentage());

	}

}
 