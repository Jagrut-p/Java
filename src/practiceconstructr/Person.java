package practiceconstructr;

public class Person {
	String name;
	Person()
	{
		System.out.println("Person: Default Constructor Called: ");
	}
	Person(String name)
	{
		System.out.println("Person: Parameterized Constructor Called: ");
		this.name = name;
	}
}