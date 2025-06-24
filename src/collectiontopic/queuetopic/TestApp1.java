package collectiontopic.queuetopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// PriorityQueue--[Priority_Task]--[Sorting Techniques]---[Sorting Techniques]
		
		// Natural Ordering--[0 to 9] / [A to Z]---[a to z]
		PriorityQueue<String> queueObj = new PriorityQueue<>();
		
		queueObj.add("rahul");//<==itr
		queueObj.add("sagar");
		queueObj.add("ankur");
		queueObj.add("krunal");
		queueObj.add("ramesh");
		queueObj.add("sejal");
		
		System.out.println("list.size() : " + queueObj.size());
		
		while(!queueObj.isEmpty()) 
		{
			String name = queueObj.poll();
			System.out.println(name);
		}
	}
}
