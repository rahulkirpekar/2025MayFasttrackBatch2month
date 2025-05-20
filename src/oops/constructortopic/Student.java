package oops.constructortopic;

// Pure Encapsulation---Data Security
public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	// Constructor
	// 1) Default  	2) Para + Copy
	
	// 1) Default Constructor
	public Student()
	{
		System.out.println("START : Default Student Constructor");
		System.out.println(rno+" " + name+" " + std);
		rno = 1;
		name = "rahul";
		std = 12;
		System.out.println(rno+" " + name+" " + std);
		System.out.println("EXIT : Default Student Constructor");
	}
	public Student(int rno,String name) 
	{
		System.out.println("START : Para Student Constructor");

		this.rno = rno; 
		this.name = name;
		
		System.out.println("EXIT : Para Student Constructor");
	}

	// Parameterised Constructor--Three args
	public Student(int rno,String name, int std) 
	{
		System.out.println("START : Para Student Constructor----"+this);

		this.rno = rno; 
		this.name = name;
		this.std = std;		
		
		System.out.println("EXIT : Para Student Constructor");
	}

	// Copy Constructor--Three args
	public Student(Student s) 
	{
		System.out.println("START : Para Student Constructor---"+this);

		this.rno = s.rno; 
		this.name = s.name;
		this.std = s.std;		
		
		System.out.println("EXIT : Para Student Constructor");
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
}
