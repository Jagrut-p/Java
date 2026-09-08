package constructorChaining;

public class Employees {
	int id;
	int salary;
	private String name;
	private String desgn;
	private String org;
	public Employees()
	{
		System.out.println("-----DEFALUT CONSTRUCTOR-----");
	}
	public Employees(int id)
	{
		System.out.println("-----PARAMETERIZED(ONE) CONSTRUCTOR-----");
		this.id = id;
	}
	public Employees(int id, int Salary)
	{
		this(id);
		System.out.println("-----PARAMETERIZED(TWO) CONSTRUCTOR-----");
		this.salary = Salary;
	}
	public Employees(int id, int Salary, String name)
	{
		this(id, Salary);
		System.out.println("-----PARAMETERIZED(THREE) CONSTRUCTOR-----");
		this.name = name;
	}
	public Employees(int id, int Salary, String name, String desgn)
	{
		this(id, Salary, name);
		System.out.println("-----PARAMETERIZED(FOUR) CONSTRUCTOR-----");
		this.desgn = desgn;
	}
	public Employees(int id, int Salary, String name, String desgn, String org)
	{
		this(id, Salary, name, desgn);
		System.out.println("-----PARAMETERIZED(FIVE) CONSTRUCTOR-----");
		this.org = org;
	}
	public void display()
	{
		System.out.println(id + " " + name + " " + salary + " " + desgn + " " + org);
	}
}
