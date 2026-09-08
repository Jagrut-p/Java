package task1;
import java.util.Scanner;
public class Employee {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int pdays, empId;
	private float tsalary, salary, finalSalary;
	public Employee()
	{
		System.out.println("Default Constructor Called: ");
		this.empId = 0;
		this.name = "N/A";
		this.salary = 0;
		this.tsalary = 0;
		this.salary = 0;
		this.finalSalary = 0;
	}
	public Employee(int empId, String name, float salary, float tsalary, int pdays)
	{
		System.out.println("Parameterized Constructor Called: ");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.tsalary = tsalary;
		this.pdays = pdays;
		this.finalSalary = presentDays();
	}
	public Employee(Employee e1)
	{
		System.out.println("Copy Constructor Called: ");
		this.empId = e1.empId;
		this.name = e1.name;
		this.salary = e1.salary;
		this.tsalary = e1.tsalary;
		this.pdays = e1.pdays;
		this.finalSalary = e1.presentDays();
	}
	public void getData()
	{
		System.out.println("Enter the Employee ID: ");
		empId = sc.nextInt();
		System.out.println("Enter the Employee Name; ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the Employee Salary: ");
		salary = sc.nextFloat();
		System.out.println("Enter the Employee Transfer Salary: ");
		tsalary = sc.nextFloat();
		System.out.println("Enter the Number of days Employee was present: ");
		pdays = sc.nextInt();
	}
	public float presentDays()
	{
		finalSalary = (salary / 26) * pdays;
		return finalSalary;
	}
	public void display()
	{
		System.out.println(empId + " " + name + " " + salary + " " + tsalary + " " + pdays);
		System.out.println("Final Salary" + presentDays());
	}
}