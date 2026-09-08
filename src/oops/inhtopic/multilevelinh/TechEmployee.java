package oops.inhtopic.multilevelinh;

public class TechEmployee extends Employee {
	String projectName;
	public TechEmployee()
	{
		System.out.println("TechEmployee: Default Constructor Called: ");
	}
	public TechEmployee(int id, String name, int salary, String dsgn, String projectname)
	{
		super(id, name, salary,dsgn);
		System.out.println("TechEmployee: Para Constructor Called: ");
		this.projectName = projectName;
	}
	public void display()
	{
		System.out.println("Id: " + id + "Salary: " + salary + "Designation: " + dsgn + "Project Name: " + projectName);
	}
	public static void main(String[] args) {
		TechEmployee e1  = new TechEmployee(1, "Hello", 12323, "CEO", "Glassgow");
		e1.display();
	}
}