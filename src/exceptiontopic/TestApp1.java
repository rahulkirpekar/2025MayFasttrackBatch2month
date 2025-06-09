package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		System.out.println("Statement--1                       ");
		System.out.println("Statement--2                       ");
		System.out.println("Statement--3                       ");
		System.out.println("Statement--4                       ");
		System.out.println("Statement--5                       ");
		
		try 
		{
			ans  = no1 / no2;
			
			int a[] = new int[5];
			a[1] = 10;
			
			String name = null;
			
			System.out.println("name.length() : " + name.length());
			
		} catch (ArithmeticException e) 
		{
			System.out.println("Catch Block Handled Exception : " + e.getMessage());
			
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Catch Block Handled Exception : " + e.getMessage());
		}
		catch (Exception e) 
		{
			System.out.println("Catch Block Handled Exception : " + e.getMessage());
		}
		finally 
		{
			System.out.println("=======Finally Block=======");
		}
		System.out.println("Result : " + ans);
		
		System.out.println("Statement--6                       ");
		System.out.println("Statement--7                       ");
		System.out.println("Statement--8                       ");
		System.out.println("Statement--9                       ");
		System.out.println("Statement--10						");
	}
}
