package oops.classandobj;

public class TestApp1 
{
	// 3) main function
	public static void main(String[] args) 
	{
		Student s1 = new Student();// s1 = [rno name std]
		Student s2 = new Student();// s2 = [rno name std]
		Student s3 = new Student();// s3 = [rno name std]
		
//		System.out.println("s1 : " + s1);
//		System.out.println("s2 : " + s2);
//		System.out.println("s3:  " + s3);
		
		// obj---reference variable---address of object;
		// new --create object---JVM
		// Student--Object--"HEAP"

		s1.scanData();
		s2.scanData();
		s3.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
