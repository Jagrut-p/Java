package stringTopic.Immutable;
import java.util.Scanner;
public class TestApp 
{
	public static void main(String[] args) {
		System.out.println("Enter your Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Name Length: " + name.length());
		for(int i=0;i<name.length();i++)
		{
			System.out.println("name.charAt(" + i + "): " + name.charAt(i));
		}
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
		}
	}
}
