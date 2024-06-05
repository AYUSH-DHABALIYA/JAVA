// W.A.J. P to create one thread by extending Thread class in another Class.
package Assignment;

class Thread_Ex extends Thread
{
	@Override
	public void run() {
		
		System.out.println("This is thread class using run method");
	}
}

public class Question_42 {

	public static void main(String[] args) {
		
		Thread_Ex obj = new Thread_Ex();
		obj.start();

	}

}
