package oops.abstractiontopic.aclass;

public abstract class A 
{
	int no1;
	A()
	{
		System.out.println("A--Default Constructor");
		no1 = 10;
	}
	
	public abstract void test1();

	public void test2() 
	{
		System.out.println("A---test2()");
	}
}
