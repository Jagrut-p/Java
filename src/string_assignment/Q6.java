package string_assignment;
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) 
	{
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name to find first Letter: ");
		s1 = sc.nextLine();
		System.out.println("First Letter of Name: " + s1.charAt(0));
	}
}
