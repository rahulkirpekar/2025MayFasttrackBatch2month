package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Dynamic Array
		ArrayList list = new ArrayList();
		
		list.add(true);//boolean--0----true[Boolean--object]		<===Itr
		list.add(12);//int---1--[Integer]
		list.add(17L);//long---2--[Long]
		list.add(12.56f);//float---3--[Float]
		list.add(453.324);//double---4--[Double]
		list.add("rahul");//string---5--[String]
		list.add('R');//char--6--[Character]
		
		Student s= new Student(1, "rahul", 12);

		list.add(s);//---7
		
		System.out.println("list.size() : " + list.size());

/*		for (int i = 0; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				
				System.out.println("list.get("+i+") : " +s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println("list.get("+i+") : " + obj);
			}
		}
------------------------------------------------------------------------------
		ForEach / Advanced for / Enahanced for looop:-
		for( Object obj	: list) 
		{
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println(obj);
			}
		}
------------------------------------------------------------------------------
	Traditional Way:-
	-----------------
		Iterator itr =	list.iterator();

		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student)                                                    
			{                                                                              
				Student s1 = (Student)obj;                                                    
				                                                                              
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());         
			} else                                                                         
			{                                                                              
				System.out.println(obj);                                                      
			}                                                                              
		}
		------------------------------------------------------------------------------
 */

		
		
		Stream s1 =	list.stream();
		
		s1.forEach(obj -> System.out.println(obj) );
		
		
		
		
		
		
		
		
		
		
		
	}
}