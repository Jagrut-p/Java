package oops.abstopic.interfacetopic.task1;

public interface A {
	//Constant Variables Public Static Final
	public static final int NO1 =10;
	public final int NO2 = 10;
	public final int NO3 = 10;
	public int NO4 = 10;
	int NO5 = 10;
	//Member Function
	//1. Abstract Methods(Public Abstract)
	public abstract void test1();
	public void test2();
	abstract void test3();
	void task4();
	static void test5()
	{
		System.out.println("A -- Static -- test5");
	}
	default void task6()
	{
		test7();
		System.out.println("A -- Default -- test5");
		test7();
	}
	private void test7()
	{
		System.out.println("A -- Private -- test7");
	}
}
