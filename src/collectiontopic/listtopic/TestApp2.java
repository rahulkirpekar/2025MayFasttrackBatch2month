package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// boolean-- Boolean
		// byte-Byte
		// short---Short
		// char--Character
		// int---Integer
		// long--Long
		// float--Float
		// double--Double
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");//<==itr
		list.add("sagar");
		list.add("ankur");
		list.add("krunal");
		list.add("ramesh");
		list.add("sejal");
		
		System.out.println("list.size() : " + list.size());
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();
			
			System.out.println(name);
		}
	}
}