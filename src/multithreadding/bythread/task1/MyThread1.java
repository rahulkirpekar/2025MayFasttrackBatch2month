package multithreadding.bythread.task1;

public class MyThread1 extends Thread
{
	Table t = null;

	public MyThread1(Table t) 
	{
		this.t = t;
	}
	@Override
	public void run() 
	{
		t.printTable(5);
	}
}
