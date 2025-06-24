package collectiontopic.sortingtech.basic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		
		System.out.println("list : " + list);
		Collections.sort(list); 
		System.out.println("After Sorting : ");
		System.out.println("list : " + list);
		
	}
}
