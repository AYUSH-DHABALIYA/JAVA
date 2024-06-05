// W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.
package Assignment;

class First_Thread extends Thread // creating first thread class 
{
	@Override
	public void run() { // runnable
		// TODO Auto-generated method stub
		System.out.println("This is First thread.");
	}
}

class Second_Thread extends Thread // second thread class 
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Second thread.");
	}
}

public class Question_43 {

	public static void main(String[] args) {
		
		First_Thread t1 = new First_Thread();
		Second_Thread t2 = new Second_Thread();
		
		t1.start();
		try 
		{
			Thread.sleep(2000); // thread sleep
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		t2.start();
	}

}
