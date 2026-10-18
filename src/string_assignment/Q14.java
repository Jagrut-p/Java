package string_assignment;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) 
	{
		String s, ch;
		int in;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to find Letter in it: ");
		s = sc.nextLine();
		System.out.println("Enter the Letter to be Searched: ");
		ch = sc.nextLine();
		in = s.indexOf(ch);
		System.out.println("Found at: " + in);
	}
}
