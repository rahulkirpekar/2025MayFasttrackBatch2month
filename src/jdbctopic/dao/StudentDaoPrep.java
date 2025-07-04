package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean s) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep -- insertStudent(StudentBean s)---Db not connected");
		} 
		return rowsAffected;
	}
	public int updateStudent(StudentBean s , int rno) 
	{
		
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE rno = ?";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
			
				pstmt.setString(1, s.getName());
				pstmt.setInt(2, s.getStd());
				pstmt.setInt(3, s.getMarks());
				pstmt.setInt(4, rno);
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep -- updateStudent(StudentBean s , int rno)---Db not connected");
		} 
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = ?";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep -- deleteStudent(int rno)---Db not connected");
		} 
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;

		ResultSet rs = null;
	
		StudentBean s = null;
		
		ArrayList<StudentBean> list = new ArrayList<>();
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
				
					s = new StudentBean(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
					
					list.add(s);
				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db nott connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		StudentBean studentBean = new StudentBean(0, "Shiva", 12, 100);

		StudentDaoPrep dao =  new StudentDaoPrep();
		
		int rowsAffected =	dao.updateStudent(studentBean, 7);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated  : " + rowsAffected);
		}
		
		
/*
		ArrayList<StudentBean> list  =dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = 	list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
	------------------------------------------------------------------------------------------------	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno Which you want to delete : ");
		int rno  = sc.nextInt();
		
		StudentDaoPrep dao =  new StudentDaoPrep();
		
		int rowsAffected =	dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted  : " + rowsAffected);
		}
//-----------------------------------------------------------------------------------------		
		StudentBean studentBean = new StudentBean(0, "Jagrav Bhatt", 12, 100);
		StudentDaoPrep dao =  new StudentDaoPrep();
		int rowsAffected =	dao.insertStudent(studentBean);
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/		
	}
}