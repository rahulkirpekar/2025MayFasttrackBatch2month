package multithreadding.byrunnable;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread : " + Thread.currentThread().getName());
		int no=15;
		for (int i = 1; i <=10 ; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "---"+no+" * " + i+" = "+ (no*i));
		}
	}
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		Thread thread1 = new Thread(t1); 
		Thread thread2 = new Thread(t2); 
		Thread thread3 = new Thread(t3); 

		thread1.start();
		thread2.start();
		thread3.start();
	}
}