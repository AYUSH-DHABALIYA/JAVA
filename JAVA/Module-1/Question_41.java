// W.A.J. P to create one thread by implementing Runnable interface in Class.
package Assignment;

class Thread_runnable implements Runnable
{
	@Override
	public void run() {
		
		System.out.println("Implements thread using interface runnable");
		
	}
}

public class Question_41 {

	public static void main(String[] args) {
		
		Thread_runnable t1 = new Thread_runnable();
		t1.run();
		

	}

}


