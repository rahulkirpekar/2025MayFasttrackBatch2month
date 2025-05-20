package oops.constructortopic;

// 2) constructor
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student sobj = new Student();// s-[rno name std] 
		
		System.out.println("Before Setter Method : "+sobj.getRno()+" " + sobj.getName()+" " + sobj.getStd());

		// 1) method
		sobj.setRno(1);
		sobj.setName("rahul");
		sobj.setStd(12);
		
		System.out.println("After Setter Method : "+sobj.getRno()+" " + sobj.getName()+" " + sobj.getStd());
	}
}
