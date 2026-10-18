package string_assignment;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int arr[] = new int[100];
		System.out.println("Enter the String: ");
		s = sc.nextLine();
		for(int i=0;i < s.length();i++)
		{
			int k = s.charAt(i);
			arr[i] = k;
		}
	}
}
