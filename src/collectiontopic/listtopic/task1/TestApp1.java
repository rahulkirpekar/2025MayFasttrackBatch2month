package collectiontopic.listtopic.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp1 
{
	public static Student isRecordAvailable(ArrayList<Student> list,int searchRno) 
	{
		Student s;
		for (int i = 0; i < list.size(); i++) 
		{
			s = list.get(i);
			if (s.getRno()==searchRno) 
			{
				System.out.println("In If");
				return s;
			}
		}
		return null;
	}
	public static int getStudentIndexByRno(ArrayList<Student> list,int searchRno) 
	{
		Student s;
		for (int i = 0; i < list.size(); i++) 
		{
			s = list.get(i);
			if (s.getRno()==searchRno) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)  
	{
		Scanner sc = new Scanner(System.in);
		int index ;
		ArrayList<Student> list = new ArrayList<Student>();
		int choice = 0;
		int searchRno ;
		boolean flag;
		do 
		{
			System.out.println("Enter below choice "); 
			System.out.println("1) For Insert Student Record");
			System.out.println("2) For Update Student Record");
			System.out.println("3) For Delete Student Record");
			System.out.println("4) For Search Student record By rno");
			System.out.println("5) For Search Student record By Name");
			System.out.println("6) For Display All Student Record");
			System.out.println("7) for Exit");
			choice = sc.nextInt();
			Student s = null;
			switch (choice) 
			{
				case 1: s = new Student();
						s.scanData();
						list.add(s);
						System.out.println("Student record successfully Inserted");
						break;
						
				case 2: System.out.println("Enter Rno which you want to Update : ");
						searchRno = sc.nextInt();
						flag = true;
						
						index  = getStudentIndexByRno(list, searchRno);

						if(index != -1) 
						{
							s = list.get(index);
							s.updateData();
							list.set(index, s);
							
							System.out.println("Student successfully Update from records.");
						}else 
						{
							System.out.println("Student reecord not found in database.");
						}
						break;
						
				case 3:	System.out.println("Enter Rno which you want to remove : ");
						searchRno = sc.nextInt();
						
						index  = getStudentIndexByRno(list, searchRno);
						
						if(index != -1) 
						{
							list.remove(index);
							System.out.println("Student reecord removed.");

						}else 
						{
							System.out.println("Student reecord not found in database.");
						}
						break;
				case 4:	System.out.println("Enter Rno which you want to Search : ");
						searchRno = sc.nextInt();
						
						s = isRecordAvailable(list, searchRno);
						
						if(s != null) 
						{
							s.dispData();
						}else 
						{
							System.out.println("Student record not found in database.");
						}
						break;
				case 5:
						// Search By Name--code
						
				case 6: 
						System.out.println("Rno Name Std");
						for (int i = 0; i < list.size() ; i++) 
						{
							s = list.get(i);
							s.dispData();
						}
						break;
				case 7:
						System.out.println("Student application will bet exit within 3 second");
						try 
						{
							Thread.sleep(3000);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(0);	
				default:
						break;
			}
		}while(choice != 7);	
	}
}