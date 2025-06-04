package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//              01234
//		String name1 = "royal";
		
		
		System.out.println("Enter Name : ");
		String name = new java.util.Scanner(System.in).next();

		boolean flag = true;
		for (int i = 0 , j = (name.length()-1); i < name.length(); i++,j--) 
		{
			if (name.charAt(i) != name.charAt(j)) 
			{
				flag = false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(name +" is Palindrome string");
		} else 
		{
			System.out.println(name +" is not Palindrome string");
		}
//		System.out.println("name1.length() : " + name1.length());

//		for (int i = 0; i < name1.length(); i++) 
//		{
//			System.out.println("name1.charAt("+ i +") : " + name1.charAt(i));
//		}
//		System.out.println("name1.charAt(1) : " + name1.charAt(1));
//		System.out.println("name1.charAt(2) : " + name1.charAt(2));
//		System.out.println("name1.charAt(3) : " + name1.charAt(3));
//		System.out.println("name1.charAt(4) : " + name1.charAt(4));
		
	}
}
