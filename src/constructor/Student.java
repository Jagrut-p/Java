package constructor;

public class Student {
	private int rno;
	private String name;
	private int fees;
	private int std;

	Student(Student s)
	{
		System.out.println("Start Para(Copy) Constructuor ");
		this.rno = s.rno;
		this.name = s.name;
		this.fees = s.fees;
		this.std = s.std;
		System.out.println("EXIT Para(Copy) Constructor");
	}
	Student(int rno, String name, int fees, int std)
	{
		System.out.println("Start Para(Copy) Constructuor ");
		this.rno = rno;
		this.name = name;
		this.fees = fees;
		this.std = std;
		System.out.println("EXIT Para(Copy) Constructor");
	}
	void display()
	{
		System.out.println("Roll No: " + rno);
		System.out.println("Name: " + name);
		System.out.println(fees + " " + std);
	}
}