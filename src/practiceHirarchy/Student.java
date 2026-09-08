package practiceHirarchy;

public class Student extends Person{
	int rno, marks, std;
	public Student(int rno, String name, int marks, int std)
	{
		super(name);
		this.rno = rno;
		this.marks = marks;
		this.std = std;
	}
	public void display()
	{
		System.out.println(rno + " " + name + " " + marks + " " + std);
	}
}
