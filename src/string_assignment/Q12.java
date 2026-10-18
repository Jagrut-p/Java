package string_assignment;
import java.util.Scanner;
public class Q12 {
	public static void main(String[] args) {
		String s1;
		String first, last;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		s1 = sc.nextLine();
		int a = s1.indexOf(' ');
		first = s1.substring(0,a);
		last = s1.substring(a+1);
		System.out.println("First: " + first);
		System.out.println("Second: " + last);
	}
}
