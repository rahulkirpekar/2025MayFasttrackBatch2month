package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	//											throws --Optional for UnChecked Exception
	public static void isValidAgeForVote(int age) throws ArithmeticException
	{
		if(age < 18) 
		{
			// Raise exception
			//				1. checked		2. Unchecked
			
			// raise checked
//			throw new IOException("\nInvalid Age,\n\tPlease enter valid Age");
			
			// raise Un-Checked
			throw new ArithmeticException("\nInvalid Age,\n\tPlease enter valid Age");
			
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
			
		} catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("===After try---catch block====");
	}
}
