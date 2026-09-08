package multilevelpractice;

public class Person {
	String name;
	public Person()
	{
		System.out.println("Person Default Constructor Called: ");
	}
	public Person(String name)
	{
		System.out.println("Person Parameterized Constructro Called: ");
		this.name = name;
	}
}
