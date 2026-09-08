/*
 Private Members:
-----------------------
	int empId
	char name[50]
	float fixedSalary,transferSalary;

 */
package employee;
import java.util.Scanner;
public class employees {
	Scanner sc = new Scanner(System.in);
	private int empId;
	private String name;
	private float fixedSalary, transferSalary;
	//Default Constructor
	employees()
	{
		System.out.println("======Default Constructor Called: ======");
		empId = 1;
		name = "Hello";
		fixedSalary = 1234;
		transferSalary = 123454;
	}
	//Parameterized Constructor
	employees(int empId, String name, int fixedSalary, int transferSalary)
	{
		System.out.println("======Parameterized Constructor Called: ======");
		this.empId = empId;
		this.name = name;
		this.fixedSalary = fixedSalary;
		this.transferSalary = transferSalary;
	}
	employees(employees e)
	{
		System.out.println("======Copy Constructor Called: ======");
		this.empId = e.empId;
		this.name = e.name;
		this.fixedSalary = e.fixedSalary;
		this.transferSalary = e.transferSalary;
		
	}
	void display()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Fixed Salary: " + fixedSalary);
		System.out.println("Transfer Salary: " + transferSalary);
	}
	void getData()
	{
		System.out.println("Enter the Employee ID: ");
		empId = sc.nextInt();
		System.out.println("Enter the Employee Name: "); 
		
	}
}