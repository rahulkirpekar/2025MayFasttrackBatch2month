package oops.inhtopic.hi;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// TechEmployee
		TechStudent techStudent = new TechStudent(1, "rahul", 10, "Java", "StudentManagement", "Grownited");
		techStudent.disp();
		
		// ManagementEmployee
		ManagementStudent managementStudent = new ManagementStudent(2, "Sagar", "HR", 12, 7, "E-Infochip");
		managementStudent.dispData();
	}
}
