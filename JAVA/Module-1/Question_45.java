/* W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set Daemon () method of Thread class and check whether the thread is set daemon or not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2(); TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); t1.setDaemon(true);//will throw exception here t2.start(); */
package Assignment;

class TestDeamonThread2 extends Thread
{
	@Override
	public void run() {
		
		try 
		{
			System.out.println("This thread is running.");
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
}

public class Question_45 {

	public static void main(String[] args) {
		
		TestDeamonThread2 t1 = new TestDeamonThread2();
		TestDeamonThread2 t2 = new TestDeamonThread2();
		
		t1.start();
		t1.setDaemon(true);
		
		t2.start();

	}

}
