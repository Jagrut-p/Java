package string_assignment;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		String  user, pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name: ");
		user = sc.nextLine();
		System.out.println("Enter the Password: ");
		pass = sc.nextLine();
		if(user.equalsIgnoreCase("Admin"))
		{
			if(pass.equals("Java123"))
			{
				System.out.println("Entered Password is Correct");
			}
			else
			{
				System.out.println("Enter a valid User Name/Password");
			}
		}
		else
		{
			System.out.println("Enter a valid User Name/Password");
		}
	}
}
