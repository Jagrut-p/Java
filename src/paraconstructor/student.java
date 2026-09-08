package paraconstructor;

public class student {
	private int rno;
	private String name;
	private int std;
	private int fees;
	student(int rno, String name, int std, int fees)
	{
		System.out.println("===Start Parameterized Constructor Assigning Values===");
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.fees = fees;
		System.out.println("===EXIT Parameterized Constructor Values has been Assigned===");
	}
	student(int rno, String name, int std)
	{
		System.out.println("===Start Parameterized Constructor===");
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("===EXIT Parameterized Constructor Values has been Assigned===");
	}
	student(int rno, String name)
	{
		System.out.println("===Start Parameterized Constructor===");
		this.rno = rno;
		this.name = name;
		System.out.println("===EXIT Parameterized Constructor Values has been Assigned===");
	}
	student(int rno)
	{
		System.out.println("===Start Parameterized Constructor===");
		this.rno = rno;
		System.out.println("===EXIT Parameterized Constructor Values has been Assigned===");
	}
	public void dispData()
	{
		System.out.println(rno + " " + name + " " + std +  " " + fees + " ");
	}
}