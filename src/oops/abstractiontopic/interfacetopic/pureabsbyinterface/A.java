package oops.abstractiontopic.interfacetopic.pureabsbyinterface;

// interface---[100% Abstraction]
public interface A 
{
	// 1. Constant Variables
	int NO = 10;// public static final 
	
	// 2. Methods
	//------------
//		1. 	Abstract Methods
	void test1();// public abstract 
	
//		2. NonAbstract Methods
			// 1. static method--8
			// 2. default method--8
			// 3. private method--9
	
	static void test2() 
	{
		System.out.println("default--test2");
	}
	default void test3() 
	{
		test4();
		System.out.println("default--test3");
	}
	private void test4() 
	{
		System.out.println("private--test4");
	}
}
