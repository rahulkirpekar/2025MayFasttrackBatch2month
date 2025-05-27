package oops.inhtopic.hi;

public class ManagementStudent extends Student
{
	String specialization;
	int caseStudyCount;
	int presentationSkillsRating;
	String internshipCompany;
	public ManagementStudent(int rno,String name,String specialization, int caseStudyCount, int presentationSkillsRating,
			String internshipCompany) 
	{
		super(rno,name);
		this.specialization = specialization;
		this.caseStudyCount = caseStudyCount;
		this.presentationSkillsRating = presentationSkillsRating;
		this.internshipCompany = internshipCompany;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + specialization+" " + caseStudyCount+" " + presentationSkillsRating+" "+internshipCompany);
	}
}
