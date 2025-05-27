package oops.statictopic.statictask;

public class Employee 
{
	private int empId;
	private String empName;
	private Project projects[];
	private static String companyName;
	
	public Employee(int empId, String empName, Project[] projects) 
	{
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}
	public static void setCompanyName(String companyName) 
	{
		Employee.companyName = companyName;
	}
	public static String getCompanyName() 
	{
		return Employee.companyName;
	}
	public void displayEmployeeDetails() 
	{
		System.out.print(empId+" " + empName + " "+ Employee.getCompanyName() +" \n\t");
		for (Project project : projects) 
		{
			System.out.print(" "+project.getProjectId()+" " +project.getProjectName());
		}
		System.out.println();
	}
}