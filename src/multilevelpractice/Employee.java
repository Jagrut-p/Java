package multilevelpractice;

public class Employee extends Person{
	int id, salary, fees;
	public Employee()
	{
		System.out.println("Employee Default Constructor Called: ");
	}
	public Employee(int id, String name, int salary, int fees)
	{
		super(name);
		System.out.println("Employee Parameterized Constructor Called ");
		this.id = id;
		this.salary = salary;
		this.fees = fees;
	}
}