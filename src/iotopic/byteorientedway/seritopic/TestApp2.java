package iotopic.byteorientedway.seritopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args)  
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025MayFasttrackBatch2month\\studentrecords.txt");
		
			ObjectInputStream oin  = new ObjectInputStream(fin);
			
			Student s = (Student)oin.readObject();
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
