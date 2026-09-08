package employee;

import java.util.Scanner;

public class testApp2 {
	public static void main(String[] args) {
		employees e1 = new employees(2, "Hello", 34671234, 123454);
		e1.display();
		employees e2 = new employees();
		e2.display();
		employees e3 = new employees(e1);
		e3.display();
	}
}