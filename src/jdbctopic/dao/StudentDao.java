package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
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
	}
}
