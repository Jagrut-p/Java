package oops.inhtopic.multilevelinh;

public class Person {
	String name;
	public Person()
	{
		System.out.println("Person Default Constructor Called: ");
		name = "NULL";
	}
	public Person(String name)
	{
		System.out.println("Person PARA Constructor Called: ");
		this.name = name;
	}
}
