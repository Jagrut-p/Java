package string_assignment;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		String s,word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		s = sc.nextLine();
		System.out.println("Enter the Word to be Searched: ");
		word = sc.nextLine();
		if(s.contains(word))
		{
			System.out.println("Word is there");
			System.out.println(s.indexOf(word));
		}
		else
		{
			System.out.println("Word not found!");
		}
	}
}
