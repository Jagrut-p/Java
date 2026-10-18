package exceptionHandling;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1, no2, ans = 0;
		System.out.println("Enter No1: ");
		no1 = sc.nextInt();
		System.out.println("Enter No2: ");
		no2 = sc.nextInt();
		try 
		{
			ans = no1 / no2;
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception Handling");
			e.printStackTrace();
		}
		System.out.println(ans);
	}
}
