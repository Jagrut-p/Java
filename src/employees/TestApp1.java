package employees;

import java.util.Scanner;

public class TestApp1 {
	public static void main(String[] args) {

		Employees2 e1 = new Employees2();
		e1.disData();
		Employees2 e2 = new Employees2(1);
		e2.disData();
		Employees2 e3 = new Employees2(2, "HELLO WORLD");
		e3.disData();
		Employees2 e4 = new Employees2(3, "GRACIAS", 12423);
		e4.disData();
		Employees2 e5 = new Employees2(4, "OLA", 123456, "BOSS", "SpaceX");
		e5.disData();
		
	}
}