package oops.finaltopic;

public class TestApp2 
{
	// Data Memebers
	final int no;

	public TestApp2() 
	{
		no = 100;
	}
	public TestApp2(int no) 
	{
		this.no = no;
	}
	public static void main(String[] args) 
	{
		TestApp2 obj = new TestApp2(1000);
		
		System.out.println("obj.no : "  + obj.no);
		
//		obj.no = 200;// C.E
//		System.out.println("obj.no : "  + obj.no);
	}
}