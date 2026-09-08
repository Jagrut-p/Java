package practiceconstructor;

public class Student extends Person{
	int rno, fees, marks;
	public void Student()
	{
		System.out.println("Default Constructor Called: ");
	}
	public Student(int rno, String name, int marks, int fees)
	{
		super(name);//parameterized
		System.out.println("Student Parameterized Constructor Called: ");
		this.rno = rno;
//		this.name = name;default
//		super.name = name;//default
		this.fees = fees;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Roll No: " + rno);
		System.out.println("Name: " + name);
		System.out.println("Fees: " + fees);
		System.out.println("Marks: " + marks);
	}
}