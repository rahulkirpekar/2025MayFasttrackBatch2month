package iotopic.byteorientedway.seritopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\Desktop\\jay-patel\\OMBPHCMCFA1.jpg");

			FileOutputStream fout = new FileOutputStream("oraclelogo.jpg");
			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
				fout.write(temp);
			}
			System.out.println("Success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
