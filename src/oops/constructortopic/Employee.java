package oops.constructortopic;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgname;
	
	public Employee() 
	{
		System.out.println("Default Employee Constructor");
	}
	
	public Employee(int id, String name) 
	{
		this();
		System.out.println("Employee(int id, String name)  Constructor");
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, int salary) 
	{
		this(id,name);
		System.out.println("Employee(int id, String name, int salary) Constructor");
		this.salary = salary;
	}
	
	public Employee(int id, String name, int salary, String dsgn) 
	{
		this(id,name,salary);
		System.out.println("Employee(int id, String name, int salary, String dsgn)");
		this.dsgn = dsgn;
	}
	public Employee(int id, String name, int salary, String dsgn, String orgname) 
	{
		this(id,name,salary,dsgn);
		System.out.println("Employee(int id, String name, int salary, String dsgn,String orgname)");
		this.orgname = orgname;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + orgname);
	}
}
