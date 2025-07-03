package jdbctopic.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// Statement---StudentDao --Student Table
public class StudentDao 
{
	public int insertStudent(StudentBean s) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+s.getName()+"',"+s.getStd()+","+s.getMarks()+")";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		int  rowAffected = 0;
		
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowAffected = stmt.executeUpdate(insertQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--Db not connected : " + conn);
		}
		return rowAffected;
	}	
	
	public int updateStudentByRno(StudentBean s, int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+s.getName()+"' , std="+s.getStd()+", marks="+s.getMarks()+" WHERE rno = "+rno;
		
		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();

				rowsAffected = stmt.executeUpdate(updateQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--updateStudentByRno(StudentBean s,int rno)---Db not connected");
		}
		return rowsAffected;
	}
	
	
	public ArrayList<StudentBean> getStudentRecords() 
	{
		String selectQuery = "SELECT * from student";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
//					int rno = rs.getInt("rno");
//					String name = rs.getString("name");
//					int std = rs.getInt("std");
//					int marks = rs.getInt("marks");

					//System.out.println(rno+" " + name+" " + std +" " + marks);
					
					
					sbean = new StudentBean(rno, name, std, marks);
					
					list.add(sbean);
				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("StudentDao --getStudentRecords() Db not connected");
		}
		return list;
	}
	public int deleteStudentByRno(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno=" + rno;
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();

				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--deleteStudentByRno(int rno)---Db not connected");
		}
		return rowsAffected;
	}
	
	public static void main(String[] args) 
	{

		StudentDao studentDao = new StudentDao();

		ArrayList<StudentBean> list = studentDao.getStudentRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
/*		
   		//---------Update student----------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno which you want to update student record : ");
		int rno = sc.nextInt();
		
		sc.nextLine();
 		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDao studentDao = new StudentDao();
		
		int rowAffected = studentDao.updateStudentByRno(s,rno);
		
		if (rowAffected > 0) 
		{
			System.out.println("Student record updated succssfully : " + rowAffected);
			
		} else 
		{
			System.out.println("Student record not updated : " + rowAffected);
		}
		//---------DELETE student----------
		System.out.println("Enter Rno which you want to delete student record : ");
		int rno = sc.nextInt();
		StudentDao studentDao = new StudentDao();
		int rowAffected = studentDao.deleteStudentByRno(rno);
		
		if (rowAffected > 0) 
		{
			System.out.println("Student record deleted succssfully : " + rowAffected);
			
		} else 
		{
			System.out.println("Student record not deleted  : " + rowAffected);
		}
   
   		//---------INSERT student----------
 		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		StudentBean s = new StudentBean(0, name, std, marks);
		StudentDao studentDao = new StudentDao();
		int rowAffected = studentDao.insertStudent(s);
		
		if (rowAffected > 0) 
		{
			System.out.println("Student record inserted succssfully : " + rowAffected);
			
		} else 
		{
			System.out.println("Student record not inserted : " + rowAffected);
		}
*/		
	}
}
