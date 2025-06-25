package multithreadding.bythread;

// 1. By extending Thread class:-
//---------------------------------
public class MyThread1 extends Thread
{
	// run()----Thread---[job]
	@Override
	public void run() 
	{
//		System.out.println("HI I am Thread---"+Thread.currentThread().getId()+"---"+Thread.currentThread().getName());
		for (int i = 1; i <=5 ; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i +" : "+Thread.currentThread().getId()+"---"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();
		
		// th1--Thread--[callstack]--[run()---Job Defined]
		th1.start();
		
		try 
		{
//			th1.join();
			th1.join(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		th2.start();
		th3.start();
	}
}