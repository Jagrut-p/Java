package string_assignment;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password: ");
		password = sc.nextLine();
		if(password.contains("@"))
		{
			if(password.length() >= 8)
			{
				System.out.println("Strong Password!");
			}
			else
			{
				System.out.println("Password is Shorter than Expected");
			}
		}
		else
		{
			System.out.println("Weak Password");
		}
	}
}
