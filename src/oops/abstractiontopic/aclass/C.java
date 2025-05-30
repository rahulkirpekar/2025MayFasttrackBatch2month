package oops.abstractiontopic.aclass;

public class C extends B
{
	int no3;
	
	C()
	{
		System.out.println("C--Default Constructor");
		no3 = 30;
	}
	@Override
	public void test3() {
		// TODO Auto-generated method stub
	}
	@Override
	public void test1() {
		
	}
	public static void main(String[] args) 
	{
		C obj = new C();
		
		System.out.println("obj.no1 : " + obj.no1);
		System.out.println("obj.no2 : " + obj.no2);
		System.out.println("obj.no3 : " + obj.no3);
		
	}
}
