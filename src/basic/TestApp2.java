package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		// for--->[ForEach loop / Enhanced for..loop / Advanced for..loop]
		for(int temp : a) 
		{
			System.out.println(temp);
		}
		
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println("A["+ i +"] : " + a[i]);
//		}
//---------------------------------------------------------------------------------		
//		System.out.println("Enter Value to search in array : ");
//		int searchValue = sc.nextInt();
//		boolean flag = true;
//		for (int i = 0; i < a.length; i++) 
//		{
//			if (searchValue == a[i]) 
//			{
//				flag = false;
//				System.out.println("A["+i+"] : " + a[i]);
//			} 
//		}
//		if (flag) 
//		{
//			System.out.println(searchValue  +" not found in Array.");
//		}
	}
}