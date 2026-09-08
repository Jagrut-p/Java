package oops.inhtopic.hierarchicalinh;

public class Employee extends Person{
	int id, salary;
	String desgn;
	public Employee()
	{
		System.out.println("Employee Default Constructor Called: ");
	}
	public Employee(int id, String name, int salary, String desgn)
	{
		super(name);
		System.out.println("Para Constructor Called: ");
		this.id = id;
		this.salary = salary;
		this.desgn = desgn;
	}
	public void display()
	{
		System.out.println(id + " "  + name  + " " + salary + " " + desgn);
	}
}
