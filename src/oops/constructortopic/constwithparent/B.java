package oops.constructortopic.constwithparent;

public class B extends A
{
	int no2;
//	public B() 
//	{
//		System.out.println("B : Default Constructor");
//		no2 = 20;
//	}
	public B(int no1,int no2) 
	{
		super(no1);
		System.out.println("B : Para Constructor");
		this.no2 = no2;
	}
}
