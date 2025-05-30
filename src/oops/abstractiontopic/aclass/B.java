package oops.abstractiontopic.aclass;

public abstract class B extends A
{
	int no2;
	public abstract void test3();
	B()
	{
		System.out.println("B--Default Constructor");
		no2 = 20;
	}
}
