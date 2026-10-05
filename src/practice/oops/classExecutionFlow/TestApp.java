package practice.oops.classExecutionFlow;

public class TestApp {
	/*
	 1. Static Block
	 2. Main()
	 3. Static Method
	 4. Instance
	 5. Constructor
	 6. Non-Static Method
	 */
	//1. Static Block - 1
	static
	{
		System.out.println("1. Static Block - TestApp1");
	}
	//2. Static Block - 2
	static 
	{
		System.out.println("1. Static Block - TestApp2");
	}
	static void Test()
	{
		System.out.println("3. TestApp: Static Method");
	}
	//4. Instance Block - 1 (Gets Execute only when Object is created)
	{
		System.out.println("TestApp: Instance Block - 1");
	}
	//4. Instance Block - 2 (Gets Execute only when Object is created)
	{
		System.out.println("TestApp: Instance Block - 2");
	}
	TestApp()
	{
		System.out.println("5. TestApp Default Constructor");
	}
	TestApp(int no)
	{
		System.out.println("5. TestApp: Parameterized Contructor");
	}
	public void test()
	{
		System.out.println("6. TestApp: Non-Static Method");
	}
	//2. MAIN()
	public static void main(String[] args) 
	{
		TestApp.Test();
		TestApp obj = new TestApp(99);
//		obj.test();
//		TestApp obj1 = new TestApp(4);
	}
}
