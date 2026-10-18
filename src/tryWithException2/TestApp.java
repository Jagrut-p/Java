package tryWithException2;
import java.util.Scanner;
public class TestApp {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1, no2, ans;
		String name = null;
		int arr[] = new int[5];
		System.out.println("Enter No1: ");
		no1 = sc.nextInt();
		System.out.println("Enter No2: ");
		no2 = sc.nextInt();
		try
		{
			ans = no1/no2;
			arr[5] = 100;
			System.out.println(name.length());
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
