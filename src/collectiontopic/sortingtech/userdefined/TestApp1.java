package collectiontopic.sortingtech.userdefined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//Collection(I)		Collections(Class)
//
//list(String/Integer/Float/Long/Double)	
//
//List
//ArrayList--list(strings)----Collections.sort(list);//Sorting List--->Data
//LinkedList
//Vector
//-----------------------------
//Set
//HashSet
//LinkedHashSet
//TreeSet(Sorting)
//-----------------------------
//Queue
//PriorityQueue
//-----------------------------
//Map
//HashMap
//LinkedHashMap
//TreeMap(Sorting)



//Sorting Techniques:-
//--------------------
//
//1. Comparable(I)			2. Comparator(I)
//----------------			----------------
//compareTo(Object obj)		  compare(Object obj1,Object obj2)	


public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "rahul", 12, 90);
		Student s2= new Student(2, "kunal", 10,80);
		Student s3= new Student(3, "rameesh", 11 , 96);
		Student s4= new Student(4, "sagar", 7 , 56);
		Student s5= new Student(5, "ankur", 10 , 100);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		Collections.sort(list, new MarksWiseStudentComparator());
		
		System.out.println("After MarksWise Sorting : ");
		itr = list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks() );
		}
		
		Collections.sort(list, new StdWiseStudentComparator());
		
		System.out.println("After StdWise Sorting : ");
		itr = list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks() );
		}
		
		Collections.sort(list, new NameWiseStudentComparator());
		
		System.out.println("After NameWise Sorting : ");
		itr = list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks() );
		}

	}
}