package oops.classandobj;

import java.util.Scanner;

//    Data Security Increase
// -----------------------------
// Pure Encapsulation = 1) Private--> Dm's    2) public--->Mf's

public class Student 
{	
	//       Object---Data members + Member function
	//         |
	// class Properties = [1) Data Members---Data + 2) Member Function--operation]
	
	// 1) Data Members---Data
	private int rno,std;
	private String name;
	
	// 2) Member Function--operation
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enterr Std : ");
		std = sc.nextInt();
	}
	public void dispData()
	{
		System.out.println(rno+" " + name+" " + std);
	}
	
	// setters--Mutators
	
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public void setName(String  name) 
	{
		this.name = name;
	}
	public void setStd(int std) 
	{
		this.std = std;
	}
	
	
	// getters--Accessors
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
	
	
	
	
	
	
	
	
	
	
	
}


