package practiceHirarchy;

public class Employee extends Person{
	int empid, salary;
	String desgn;
	public Employee(int empid, String name, int salary, String desgn)
	{
		super(name);
		this.empid = empid;
		this.salary = salary;
		this.desgn = desgn;
	}
	public void display()
	{
		System.out.println(empid + " " + name+ " "  + salary + " " + desgn);
	}
}
