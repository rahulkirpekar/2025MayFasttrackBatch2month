package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name = "Royal technosoft private technosoft limited";
		
		String words[] = name.split("\\s");
		
		for (int i = 0; i < words.length; i++) 
		{
			System.out.println("words["+i+"] : " + words[i]);
			
		}
		
//		String name1 = "royal";
//		String name2 = new String("royal").intern();
		
//		System.out.println(name1==name2);// false
		
		// other type value---convert into String
//		String no1Str = String.valueOf(10);
//		String no2Str = String.valueOf(20);
		
//		System.out.println("no1Str+no2Str : " + (no1Str+no2Str));// 1020
		
		// String --int---convert into integer
//		int no1 = Integer.parseInt(no1Str);// 10--int-->10
//		int no2 = Integer.parseInt(no2Str);// 20--int-->20
		
//		System.out.println("No1 : " + no1);//10
//		System.out.println("No2 : " + no2);//20
		
//		int ans = no1+no2;//30
//		System.out.println("Addition : " + ans);//30
		
		
//		String name = "royal";
		
//		char n[] = name.toCharArray();
		
//		for (char c : n) 
//		{
//			System.out.println(c);
//		}
		
		
		
//		String name = " royal technosoft ";
//		System.out.println("name.length() : " + name.length());//7
//		int length = name.trim().length();
//		System.out.println("length : " + length);
			//		         6
//		String name = "Royal technosoft private technosoft limited";

		//		System.out.println("name.startsWith(\"royal\") : " + name.startsWith("Royal"));
//		System.out.println("name.endsWith(\"limited\") : " + name.endsWith("limited"));
		
//		int index =  name.indexOf("technosoft");
//		int index =  name.indexOf("technosoft", 7);
//		System.out.println("index : " + index);
		
		
//		String name = "Royal technosoft private technosoft limited";
//		System.out.println(name);
//		name = name.replace("technosoft", "soft");
//		System.out.println(name);
	}
}
