package iotopic.fileclass;

import java.io.File;
import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("fasttrack");
		
		System.out.println("file.exists() : " + file.exists());
		
		file.mkdir();

		System.out.println("file.exists() : " + file.exists());
		
		File f1 = new File("fasttrack", "test1.txt");
		
		System.out.println("f1.exists() : " + f1.exists());
		
		if (f1.createNewFile()) 
		{
			System.out.println("First File Created : " + f1.getName());
		}
		File f2 = new File("fasttrack", "test2.txt");
		
		if (f2.createNewFile()) 
		{
			System.out.println("Second File Created : " + f2.getName());
		}
		File f3 = new File("fasttrack", "test3.txt");
		
		if (f3.createNewFile()) 
		{
			System.out.println("Third File Created : " + f3.getName());
		}
		
		File listOfile[] =	file.listFiles();
//		int count = 0;
		for (File file1 : listOfile) 
		{
//			count++;
			System.out.println(file1.getName());
		}
		
		System.out.println("Total Files : " + listOfile.length);
		
		
	}
}
