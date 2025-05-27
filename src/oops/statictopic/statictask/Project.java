package oops.statictopic.statictask;
public class Project 
{
	private int projectId;
	private String projectName;	
	public Project() 
	{
	}
	public Project(int projectId, String projectName) 
	{
		this.projectId = projectId;
		this.projectName = projectName;
	}
	public void displayProjectDetails() 
	{
		System.out.println(projectId + " " +  projectName);
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
