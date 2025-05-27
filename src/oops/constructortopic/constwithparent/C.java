package oops.constructortopic.constwithparent;

public class C extends B
{
	int no3;
//	public C() 
//	{
//		System.out.println("C : Default Constructor");
//		no3 = 30;
//	}
	public C(int no1,int no2,int no3) 
	{
		super(no1,no2);
		System.out.println("C : Para Constructor");
		this.no3 = no3;
	}
	public void dispData()
	{
		System.out.println("\nNo1 : "+no1 + "\nNo2 :  " + no2 +  "\nNO3 :  " + no3);
	}
	public static void main(String[] args) 
	{
		C obj = new C(100,200,300);
		obj.dispData();
	}
}
