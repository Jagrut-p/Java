package practice.oops.polymorphism.runtime.task1;

import java.util.Scanner;

public class TestApp {
	public static void getBehaveByPlace(Person person) {
		person.getBehave();
	}

//	public static void getBehaveByPlace(School school)
//	{
//		school.getBehave();
//	}
//	public static void getBehaveByPlace(Org org)
//	{
//		org.getBehave();
//	}
//	public static void getBehaveByPlace(Home home)
//	{
//		home.getBehave();
//	}
//	public static void getBehaveByPlace(PublicPlace publicplace)
//	{
//		publicplace.getBehave();
//	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the choice: ");
		choice = sc.nextInt();
		Person person = null;
		switch (choice) {
		case 1:
			person = new Org();
			getBehaveByPlace(person);
			break;
		case 2:
			person = new School();
			getBehaveByPlace(person);
			break;
		case 3:
			person = new PublicPlace();
			getBehaveByPlace(person);
			break;
		case 4:
			person = new Home();
			getBehaveByPlace(person);
			break;
		}
	}
}
