package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args)  
	{
		StringBuilder sb = new StringBuilder(); 
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\2025MayFasttrackBatch2month\\royal.txt");

			int temp;
			
			while(	(temp=fr.read())	!= -1) 
			{
				sb.append((char)temp);
			}
			fr.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}
