package practice.oops.abstopic.aclass.task2;

import java.util.Scanner;

public class TestApp {
	public static void getBehaveByPlace(Person person) {
		person.getBehave();
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		choice = sc.nextInt();
		Person val = null;
		switch (choice) {
		case 1:
			val = new Org();
			getBehaveByPlace(val);
			break;
		case 2:
			val = new Home();
			getBehaveByPlace(val);
			break;
		case 3: val = new PublicPlace();
			getBehaveByPlace(val);
			break;
		case 4:
			val = new School();
			getBehaveByPlace(val);
			break;
		}
	}
}
