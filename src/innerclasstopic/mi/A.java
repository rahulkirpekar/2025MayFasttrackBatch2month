package innerclasstopic.mi;

// Outerclass---A
public class A 
{
	private int no = 100;
	// Member Innerclass--B
	class B
	{
		void show() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		// OuterClass
		A objA = new A();
		
		// member Innerclass--object
		A.B objB = objA.new B();
		
		objB.show();
	}
}
