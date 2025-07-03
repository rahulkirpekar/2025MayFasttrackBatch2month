package multithreadding.bythread;

public class MyThread3 extends Thread
{
	@Override
	public void run() 
	{
		if (isDaemon()) 
		{
			System.out.println("HI I am Daemon Thread(Serice Provider Thread)");
		} else 
		{
			System.out.println("I am Thread");
		}	
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		MyThread3 t1 = new MyThread3();
		t1.setDaemon(true);
		t1.start();
		
		try 
		{
			Thread.sleep(500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}