package oops.polymorphism.runtime.task1;

import java.util.Scanner;

public class TestApp1 
{
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
					person.getBehave();
					break;
					
			case 2: person = new PublicPlace();
					person.getBehave();
					break;
					
			case 3: person = new School();
					person.getBehave();
					break;
					
			case 4: person = new Org();
					person.getBehave();
					break;
		}
	}
}




