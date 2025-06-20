package innerclasstopic.loclain;

public class A 
{
	private int no = 100;
	
	void dispData() 
	{
		// Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println("No : " + no);
			}
		}
		B objB = new B();
		objB.show();
	}

	public static void main(String[] args) 
	{
		A objA = new A();
		
		objA.dispData();
	}
}
