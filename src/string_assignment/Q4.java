package string_assignment;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter the Website Name: ");
		s1 = sc.nextLine();
		if(s1.endsWith(".com"))
		{
			System.out.println("Commercial Website");
		}
		else if(s1.endsWith(".org"))
		{
			System.out.println("Orgranisation Website");
		}
		else if(s1.endsWith(".in"))
		{
			System.out.println("Indian Website");
		}
		else if(s1.endsWith(".edu"))
		{
			System.out.println("Educational Website");
		}
		else if(s1.endsWith(".us"))
		{
			System.out.println("American Website");
		}
		else if(s1.endsWith(".au"))
		{
			System.out.println("Australian Website");
		}
	}
}
