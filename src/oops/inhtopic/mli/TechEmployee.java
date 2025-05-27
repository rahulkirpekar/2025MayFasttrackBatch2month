package oops.inhtopic.mli;

import java.util.Scanner;
// 3
public class TechEmployee extends Employee
{
	String technology;
	
	public TechEmployee(int id,String name,int salary,String dsgn,String technology) 
	{
		super(id, name, salary, dsgn);
		this.technology = technology;
	}
	
//	void scanData() 
//	{
//		Scanner sc =  new Scanner(System.in);
//		System.out.println("Enter Id : ");
//		id = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		name = sc.nextLine();
//		System.out.println("Enter Salary : ");
//		salary = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Dsgn : ");
//		dsgn = sc.nextLine();
//		System.out.println("Enter WorkIn technology : ");
//		technology  = sc.nextLine();
//	}
	void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + technology);
	}
}
