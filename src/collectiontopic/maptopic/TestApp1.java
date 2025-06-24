package collectiontopic.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Map--[Key,Value]
		
		// HashMap---[Key,Value]---[Not maintain Insertion order]
		
		// LinkedHashMap--[Key,Value]---[Maintain Insertion order]
		
		// TreeMap--[Key,Value]----[Sorting Ascending order]
		
//		HashMap<Integer, String> mapObj = new HashMap<>();
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<>();
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
		mapObj.put(11, "Rahul");// Entry---[Key,Value]
		mapObj.put(90, "Kunal");// Entry---[Key,Value]
		mapObj.put(36, "Ramesh");// Entry---[Key,Value]
		mapObj.put(4, "Sagar");// Entry---[Key,Value]
		mapObj.put(50, "Ankur");// Entry---[Key,Value]
		
		for(	Map.Entry<Integer, String> e : mapObj.entrySet()) 
		{
			// e--[Key,Value]
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}











