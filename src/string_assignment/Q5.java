package string_assignment;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String rollno;
		System.out.println("Enter the Roll No: ");
		rollno = sc.nextLine();
		if (rollno.startsWith("RTS")) 
		{
			System.out.println(rollno.substring(3));
		}
		else
		{
			System.out.println("Enter the correct Roll No");
		}
	}
}
