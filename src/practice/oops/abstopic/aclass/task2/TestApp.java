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
		Person person = null;
		switch (choice) {
		case 1:
			person = new Org();
			getBehaveByPlace(person);
			break;
		case 2:
			person = new Home();
			getBehaveByPlace(person);
			break;
		case 3:
			person = new School();
			getBehaveByPlace(person);
			break;
		case 4: person = new PublicPlace();
			getBehaveByPlace(person);
			break;
		}
	}
}
