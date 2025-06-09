package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// StringBuilder--[NonThread Based Application]
		// StringBuffer--  [Thread Based Application]
		
		StringBuffer sb1 = new StringBuffer("royal");
		StringBuffer sb2 = new StringBuffer("techno");
		
		
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
		
		// Mutableway
		sb1.append(sb2);
		
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
		
		
		
		
//		IMMUTABLE WAY		
//		String name1 = "royal";
//		String name2 = "techno";
//		
//		System.out.println("Name1 : " + name1);
//		System.out.println("Name2 : " + name2);
//
//		name1.concat(name2);// royaltechno
//		
//		System.out.println("Name1 : " + name1);
//		System.out.println("Name2 : " + name2);
		
	}
}
