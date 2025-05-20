package oops.classandobj;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s1= new Student();//s1 = [rno name std]

//		s1.rno=1;
//		s1.name = "rahul";
//		s1.std=12;
		
		s1.setRno(1);
		s1.setName("Ankur");
		s1.setStd(12);
		
		System.out.println(s1.getRno()+" " +s1.getName()+" " + s1.getStd());
	}
}
