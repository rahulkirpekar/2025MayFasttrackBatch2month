package oops.inhtopic.mli;
// 2
public class Employee extends Person
{
	int id, salary;
	String dsgn; 
	
	public Employee(int id,String name,int salary,String dsgn) 
	{
		super(name);
		this.id = id;
		this.salary=salary;
		this.dsgn = dsgn;
	}
	
}
