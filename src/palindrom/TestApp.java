package palindrom;
/*
	Royal
	layoR
*/
import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you String: ");
		String s1 = sc.nextLine();
		int count = s1.length();
		int c = 0;
		for (int i = 0; i < s1.length(); i++) 
		{
			count--;
			if(s1.charAt(i) == s1.charAt(count))
			{
				c++;
			}
		}
		if(c == s1.length())
		{
			System.out.println("Entered String is Palindrom");
		}
		else
		{
			System.out.println("String not Palindrom");
		}
	}
}
