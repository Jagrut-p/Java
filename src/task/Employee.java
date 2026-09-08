package task;
import java.util.Scanner;
public class Employee {
	Scanner sc = new Scanner(System.in);
	private int empID;
	private String name;
	private float fixedSalary;
	private float transferSalary;
	private int presentDay;
	Employee()
	{
		System.out.println("Default Constructor Called: ");
		empID = 0;
		name = "NA";
		fixedSalary = 0;
	}
	Employee(int empID, String name, float fixedSalary)
	{
		System.out.println("Parameterized Constructor Called: ");
		this.empID = empID;
		this.name = name;
		this.fixedSalary = fixedSalary;
	}
	Employee(Employee e)
	{
		System.out.println("Copy Constructor Called: ");
		this.empID = e.empID;
		this.name = e.name;
		this.fixedSalary = e.transferSalary;
	}
	public void display()
	{
		System.out.println(empID + " " + name + " " + fixedSalary + " " + " " + transferSalary + " " + presentDay);
	}
	public void getData()
	{
		System.out.println("Enter the Employee Name: ");
		String x = sc.nextLine();
		
	}
}


