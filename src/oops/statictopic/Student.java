package oops.statictopic;

public class Student 
{
	int rno;
	String name;
	int std;
	
	// Classlevel Variable---static
	static String schoolName;
	
	public Student() 
	{
	}
	// static  method to set static properties
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	public Student(int rno,String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name +" " + std + " " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName("DPS");
		
		Student s1= new Student(1,"rahul",12);// s1--[rno name std] 
		Student s2= new Student(2,"Ankur",10);// s2--[rno name std] 
		Student s3= new Student(3,"Sagar",11); // s3--[rno name std]
		
		s1.dispData();
		s2.dispData();
		s3.dispData();

		// s1.schoolName = "Abc";
		Student.schoolName = "Abc";
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
/*
4. object.method   obj.disp();---schoolName
3. object create
2. main
1. static
*/