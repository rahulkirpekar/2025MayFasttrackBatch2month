package oops.abstractiontopic.interfacetopic.task1;

import java.util.Scanner;

public class TestApp1 
{
					  // getPlaceByBehaviour
	public static void getExecuteByProfile(Person person) // Home
	{
		person.getBehave();// Home--Object
		
//		person.getMovieOnTime();// C.E
		
		// Downcasting
//		Home homeMember = (Home)person;
//		homeMember.getMovieOnTime();
		
		if (	person instanceof School) 
		{
			School student = (School) person;
			student.getResult();
			
		}else if (	person instanceof Home) 
		{
			Home home = (Home) person;
			home.getMovieOnTime();
		}
		else if (	person instanceof PublicPlace) 
		{
			PublicPlace citizen = (PublicPlace) person;
			citizen.getPublicEvents();
		}
		else if (	person instanceof Org) 
		{
			Org employee = (Org) person;
			employee.getSalary();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice By Place : ");
		System.out.println("1) for Home");
		System.out.println("2) for PublicPlace");
		System.out.println("3) for School");
		System.out.println("4) for Org");
		int choice =  sc.nextInt();

		Person person = null;
		
		switch (choice) 
		{
			case 1: 
					// Upcasting--[Parent reference  = child Object]
					person = new Home();
//					person.getBehave();
					
					getExecuteByProfile(person);
					break;
					
			case 2: person = new PublicPlace();
//					person.getBehave();
					
					getExecuteByProfile(person);
					break;
					
			case 3: person = new School();
//					person.getBehave();
					
					getExecuteByProfile(person);
					break;
					
			case 4: person = new Org();
//					person.getBehave();
					
					getExecuteByProfile(person);
					break;
		}
		
		Person.test1();
		person.test2();
		
		
	}
}