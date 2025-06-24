package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// ArrayList and LinkedList ans Vector
		Vector<String>list = new Vector<String>();
		
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
