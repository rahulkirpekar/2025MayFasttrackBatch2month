package oops.inhtopic.hi;

public class TechStudent extends Student
{
	String programmingLanguages;
	int labScores;
	String projectTitle;
	String internshipCompany;
	
	public TechStudent() 
	{
	}
	public TechStudent(int rno,String name,int labScores,String programmingLanguages,String projectTitle,String internshipCompany) 
	{
		super(rno,name);
		this.programmingLanguages = programmingLanguages;
		this.labScores = labScores;
		this.projectTitle = projectTitle;
		this.internshipCompany = internshipCompany;
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+" " + programmingLanguages+" " + labScores+" " + projectTitle+" " + internshipCompany);
	}
}