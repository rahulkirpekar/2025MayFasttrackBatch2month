package collectiontopic.sortingtech.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
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
		
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		
		itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
	}
}
