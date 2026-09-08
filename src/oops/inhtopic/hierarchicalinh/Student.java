package oops.inhtopic.hierarchicalinh;

public class Student extends Person{
	int rno, marks, fees;
	public Student()
	{
		System.out.println("Default Constructor Called: ");
	}
	public Student(int rno, String name, int marks, int fees)
	{
		super(name);
		this.rno = rno;
		this.marks = marks;
		this.fees = fees;
	}
	public void display()
	{
		System.out.println(rno + " "  + name  + " " + marks + " " + fees);
	}
}
