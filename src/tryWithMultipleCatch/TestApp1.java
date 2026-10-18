package tryWithMultipleCatch;
import java.util.Scanner;

import exception.ArithmaticException;
public class TestApp1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no1, no2, ans = 0;
		int no[] = new int[5];
		System.out.println("Enter No1: ");
		no1 = sc.nextInt();
		System.out.println("Enter No2: ");
		no2 = sc.nextInt();
		try
		{
			ans = no1 /no2;
			no[5] = 100;
			System.out.println(no[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Index Out Of Bound Exception");
			e.printStackTrace();
		}
		System.out.println(ans);
	}
}
