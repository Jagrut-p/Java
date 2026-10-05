package oops.classexecutionFlow;

public class TestApp1 {
	//1. Static Block
	static
	{
		System.out.println("1. Static Method");
	}
	//3. Static Method
	static void Test()
	{
		System.out.println("3. TestApp : Static Method");
	}
	static 
	{
		System.out.println("1. Static Method - 2");
	}
	//4. Instance Block
	{
		System.out.println("4. Instance Block - 1");
	}
	{
		System.out.println("4. Instance Block - 2");
	}
	//5. Constructor -- Default, Para
	TestApp1()
	{
		System.out.println("5. TestApp1 - Default Constructor");
	}
	TestApp1(int no)
	{
		System.out.println("5. TestApp1 - Parameterized Constructor");
	}
	//6. Non-Static Method
	void Test2()
	{
		System.out.println("6. TestApp1 : Non-Static Methd");
	}
	//2. Main Function
	public static void main(String[] args)
	{
		System.out.println("2.=====Start Main Function=====");
		TestApp1.Test();
		TestApp1 obj = new TestApp1();
		obj.Test2();
		System.out.println("=====Exit Main Function=====");
	}
}
