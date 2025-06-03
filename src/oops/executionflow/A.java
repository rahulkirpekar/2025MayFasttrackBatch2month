package oops.executionflow;

public class A 
{
	//1. static Block
	static 
	{
		System.out.println("1. STATIC BLOCK---1");
	}
	static 
	{
		System.out.println("1. STATIC BLOCK---2");
	}
	// 3. static method
	static void testStatic() 
	{
		System.out.println("3. STATIC METHOD");
	}
	// 4. Instance Block
	{
		System.out.println("4. INSTANCE BLOCK----1");
	}
	{
		System.out.println("4. INSTANCE BLOCK----2");
	}
	// 5. Default Construtor
	A()
	{
		System.out.println("5. DEFAULT CONSTRUCTOR");
	}
	// 5. Para Constructor
	A(int no)
	{
//		this();
		System.out.println("5. PARA CONSTRUCTOR");
	}
	
	// 6. Non-static method
	void testNonStatic() 
	{
		System.out.println("6. NON-STATIC METHOD");
	}
	
	// 2. Main Method
	public static void main(String[] args) 
	{
		System.out.println("2. START : Main method");

		A.testStatic();
		
		A obj1 = new A();
		A obj2 = new A();

		obj1.testNonStatic();
		obj2.testNonStatic();
		
		System.out.println("7.EXIT : MAIN METHOD");
	}
}
/*
  					[Java Class Execution Flow] 
-----------------------------------------------------------------------------   
| Order | What Executes              | When It Executes                  |
| ----- | -------------------------- | --------------------------------- |
| 1     | Static Blocks              | Only once when class loads        |
| 2     | main() method              | Program starting point            |
| 3     | Static methods (if called) | From main() or anywhere           |
| 4     | Instance blocks            | Every time object is created      |
| 5     | Constructor                | Immediately after instance blocks |
| 6     | Non-static methods         | Called using object               |
-----------------------------------------------------------------------------
*/






