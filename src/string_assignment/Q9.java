package string_assignment;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		String fn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File Name with extension: ");
		fn = sc.nextLine();
		if(fn.endsWith(".pdf"))
		{
			System.out.println("It is a PDF");
		}
		else
		{
			System.out.println("It is not a PDF");
		}
	}
}
