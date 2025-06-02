package oops.abstractiontopic.interfacetopic.task1;

public interface Person 
{
	public abstract void getBehave() ;
	
	// static 
	static void test1() 
	{
		System.out.println("Person---static---test1()");
	}
	// default
	default void test2() 
	{
		test3(); 
		System.out.println("Person---default---test2()");
	}
	// private
	private void test3() 
	{
		System.out.println("Person---private--test3()");
	}
}

