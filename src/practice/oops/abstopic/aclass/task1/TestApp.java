package practice.oops.abstopic.aclass.task1;

public class TestApp {
	public static void main(String[] args) {
		A objA = new C(); // upcasting
		objA.test1();
		objA.test2();
		objA.test3();
		objA.test4();
		objA.test5();
		objA.test6();
		if (objA instanceof C) {
			C objC = (C)objA;//downcasting
			objC.test7();
			objC.test8();
		}
	}
}
