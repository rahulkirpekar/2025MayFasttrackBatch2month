package oops.constructortopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		System.out.println("START : Main Method");

		Student sobj = new Student(2,"Ankur",12);
		
		System.out.println(sobj.getRno()+" " + sobj.getName()+" " + sobj.getStd()); 
		
		Student sobj2 = new Student(sobj);
		
		System.out.println(sobj2.getRno()+" " + sobj2.getName()+" " + sobj2.getStd()); 
		
		// Student--reference Class-Type
		// sobj --reference variable
		
		// = Compound Assingment Operator
		
		// new -- keyword---Object create---JVM
		
		// Student--create Object by JVM
		
		// Student()--SAME Class--Constructor call
		
//		System.out.println(sobj.getRno()+" " + sobj.getName()+" " + sobj.getStd()); 
		
		System.out.println("EXIT : Main Method");
	}
}
