package exceptiontopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void isValidAgeForVote(int age) //throws InvalidAgeException
	{
		if(age < 18) 
		{
			// checked -- User Defined Exception
//			throw new InvalidAgeException("\n\"Invalid Age\n\tPlease enter valid age.\"");
			
			// Un-checked -- User Defined Exception
			throw new InvalidAgeException("\n\"Invalid Age\n\tPlease enter valid age.\"");
						
		}else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote: ");
		int age = sc.nextInt();
		
		try 
		{
			isValidAgeForVote(age);
			
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("===After try---catch block====");
	}
}