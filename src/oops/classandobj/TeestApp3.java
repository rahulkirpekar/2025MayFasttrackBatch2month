package oops.classandobj;

public class TeestApp3 
{
	public static void main(String[] args) 
	{
		// object array
		Student s[] = new Student[5];

		System.out.println("s.length : " + s.length);
		
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}
