package multithreadding.bythread;

public class MyThread2 extends Thread
{
	@Override
	public void run() 
	{
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
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		
		t1.setName("C Language");
		t2.setName("C++ Language");
		t3.setName("Java Language");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
