package multilevelpractice;

public class TechEmployee extends Employee{
	String pname;
	public TechEmployee()
	{
		System.out.println("TechEmployee Default Constructor Called: ");
	}
	public TechEmployee(int id, String name, int salary, String pname, int fees)
	{
		super(id, pname, salary,fees);
		System.out.println("TechEmployee Parameterized Constructor Called: ");
		this.pname = pname;
	}
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);
		System.out.println("Fees: " + fees);
		System.out.println("Project Name: " + pname);
	}
	public static void main(String[] args) {
		TechEmployee e1 = new TechEmployee(1,"Hello",10000,"GlassGow",1234);
		e1.display();
	}
}
