package practiceconstructr;

public class Student extends Person{
	int rno, marks, fees;
	Student()
	{
		System.out.println("Student Default Constructor Called: ");
	}
	Student(int rno, String name, int marks, int fees)
	{
//		super(name); //It will take data from Parent' Constructor only!
		System.out.println("Studnet Parameterized Constructor Called: ");
//		this.name = name;   //If data present in child than it will from it only else it will goto Parent 
		super.name = name;//Doesn't matter if data is present in child it will take it from parent only
		this.rno = rno;
		this.marks = marks;
		this.fees = fees;
	}
	void display()
	{
		System.out.println("Roll No: " + rno);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Fees: " + fees);
	}
}	