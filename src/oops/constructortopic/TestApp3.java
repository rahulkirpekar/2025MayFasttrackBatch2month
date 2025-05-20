package oops.constructortopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(12, "Sagar", 10);
		
		
		System.out.println(s1.getRno()+" " +  s1.getName()+" " + s1.getStd());
	}
}
