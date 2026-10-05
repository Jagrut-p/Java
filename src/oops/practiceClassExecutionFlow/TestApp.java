package oops.practiceClassExecutionFlow;

public class TestApp {
	//1. Static Block
	static 
	{
		System.out.println("1. Static Block - Executes only if Class is there (which will be always there as Java Code can't run without Classes)");
	}
	//2. Main()
	public static void main(String[] args) {
		System.out.println("2. Main()");
		TestApp obj = new TestApp(2);
		test();
		obj.test2();
	}
	//3. Instance Block
	{
		System.out.println("3. Executes only if object is Created - Instance Block will get execute from top to bottom before Constructor");
	}
	//4. Constructor Default 
	TestApp()
	{
		System.out.println("4. Executes Manually (At Time of object Creation) - Default Constructor");
	}
	//4. Parameterized Constructor 
	TestApp(int no)
	{
		System.out.println("4. Executes Manually (At Time of object Creation) - Parameterized Constructor("+ no + ")");
	}
	//5. Static Method void test
	static void test()
	{
		System.out.println("5. Executes Manually (not Dependent on object creation) - Static Method");
	}
	//6. Non - Static Method
	void test2()
	{
		System.out.println("6. Executes Manually (Totally Dependent - If object is not created, non-static method will not get called)- Non Static Method");
	}
}
