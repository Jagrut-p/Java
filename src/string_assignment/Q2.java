package string_assignment;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) 
	{
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		s1 = sc.nextLine();
		if (s1.startsWith("EMP")) 
		{
			System.out.println("Entered Employee ID is valied!");
			int l = s1.length();
			System.out.println("Length of the Employee ID: " + l);
		}
		else
		{
			System.out.println("Enter a valid Employee ID");
		}
	}
}
