package singleInheritance;

import java.util.Scanner;

public class Student extends Person {
	int rno;
	int std;
	String name;
	int fees;

	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roll No: ");
		rno = sc.nextInt();
		System.out.println("Enter the Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the Std: ");
		std = sc.nextInt();
		System.out.println("Enter the Fees: ");
		fees = sc.nextInt();
	}
	public void display()
	{
		System.out.println("Roll No: "+ rno);
		System.out.println("Name: " + name);
		System.out.println("Std: " + std);
		System.out.println("Fees: " + fees);
	}
}
