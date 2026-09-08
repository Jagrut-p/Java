package oops.inhtopic.multilevelinh;

public class Employee extends Person{
	int id, salary;
	String dsgn;
	public Employee()
	{
		System.out.println("Employee: Default Constructor Called: ");
	}
	public Employee(int id, String name, int salary, String dsgn)
	{
		super(name);
		System.out.println("Employee: Para(Three) Constructor Called: ");
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
	}
}
