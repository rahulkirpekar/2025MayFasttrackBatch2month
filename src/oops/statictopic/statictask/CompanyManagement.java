package oops.statictopic.statictask;

public class CompanyManagement 
{
	public static void main(String[] args) 
	{
		// rahul--
		Project projects1[] = 
			{
					new Project(1, "AI Development"),
					new Project(2, "Web Development")
			};

		Employee.setCompanyName("Abc");
		
		Employee rahulEmp = new Employee(1, "Rahul Kirpekar", projects1);
		rahulEmp.displayEmployeeDetails();
		

		Project projects2[] = 
			{
					new Project(1, "MobileApp Development"),
					new Project(2, "PhpWeb Development")
			};

		Employee sarjanEmp = new Employee(1, "Sarjan Patel", projects2);
		sarjanEmp.displayEmployeeDetails();
	}
}