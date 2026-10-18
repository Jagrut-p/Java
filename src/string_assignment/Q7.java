package string_assignment;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		int i;
		String s1[] = {"Laptop", "Mouse","Keyboard", "Monitor"};
		String word;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word to be Searched: ");
		word = sc.nextLine();
		for(i=0;i<4;i++)
		{
			if(s1[i].equalsIgnoreCase(word))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Word is there in List");			
		}
		else
		{
			System.out.println("Word is not there");
		}
	}
}
