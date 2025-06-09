package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
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
			try 
			{
				ans  = no1 / no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				int a[] = new int[5];
				a[1] = 10;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try {
				String name = null;
				System.out.println("name.length() : " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			///....
		}catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
}
