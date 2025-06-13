package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			// Source File---read
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025MayFasttrackBatch2month\\src\\iotopic\\byteorientedway\\TestApp1.java");

			// Destination File---write
			
			FileOutputStream fout = new FileOutputStream("TestApp1Clone.java");
			
			int temp;
			
			while(	(temp = fin.read())  != -1)
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
			fout.close();
			fin.close();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
