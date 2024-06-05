// W.A.J.P to start the same Thread twice by calling start () method twice. Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
package Assignment;

import java.util.DuplicateFormatFlagsException;

class TestThreadTwice extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Twice Thread");
		
	}
}

public class Question_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThreadTwice tx = new TestThreadTwice();
		
		try 
		{
			tx.start(); //  calling start method twice 
			tx.start();
		} 
		
		catch (Exception e)
		{
			System.out.println("Thread are twice by calling twice start method " + e);
			
		}
	}

}
