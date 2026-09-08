package constr;

public class Student {

	private int rno;
	private String name;
	private int std;
	private int fees;
	Student()
	{
		System.out.println("===Default Constructor===");
		System.out.println(rno + " " + name + " " + std + " " + fees);
		rno = 12;
		name = "Hello";
		std = 12;
		fees = 12342;
		System.out.println("===Student Construtor===");
		System.out.println(rno + " " + name + " " + std + " " + fees);
		System.out.println("===EXIT Student Constructor===");
	}
	public void dispData()
	{
		System.out.println(rno + " " + name + " " + std + " " + fees + " " + this);
	}
}