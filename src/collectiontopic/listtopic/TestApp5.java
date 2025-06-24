package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		// ArrayList and LinkedList
		LinkedList<String>list = new LinkedList<String>();
		
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
