package collectiontopic.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashSet<String>setObj = new HashSet<String>();
//		LinkedHashSet<String>setObj = new LinkedHashSet<String>();
		TreeSet<String>setObj = new TreeSet<String>();
		
		setObj.add("rahul");//<==itr
		setObj.add("krunal");
		setObj.add("ramesh");
		setObj.add("sagar");
		setObj.add("sejal");
		setObj.add("ankur");
		setObj.add("krunal");
		setObj.add("ramesh");
		setObj.add("sejal");
		
		System.out.println("list.size() : " + setObj.size());
		
		Iterator<String> itr = setObj.iterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();			
			System.out.println(name);
		}
	}
}
