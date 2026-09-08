package oops.inhtopic.hierarchicalinh;

public class Person 
{
	String name;
	public Person()
	{
		System.out.println("Default Constructor Called: ");
	}
	public Person(String name)
	{
		System.out.println("Parameterized Constructor Called");
		this.name = name;
	}
}
