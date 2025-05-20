package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Array Declaration
		//------------------------------
//			int a[] = new int[5];
//			int[] a = new int[5];
//		 	int []a = new int[5];
//		 	int [] a = new int[5];
		//------------------------------
//			int [] a = null;
//			a = new int[5];
		//------------------------------
		// Array Declaration with Initialisation
		 	
//			int a[] = {10,20,30,40,50};

			float[] a = new float[5];
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("a.length : "+a.length);// 
			
			float sum = 0;
			
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("Enter A["+ i +"] : ");
				a[i] = sc.nextFloat();	
			}
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("A["+ i +"] : " + a[i]);
				sum += a[i];
			}
			System.out.println("Sum : " + sum);

			
			// for---->[for-each / Enhanced for..loop / Advanced for..loop]
			// while
			// do..while
			

		
	}
}
