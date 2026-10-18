//Email Verification
package string_assignment;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email ID: ");
		email = sc.nextLine();
		if (email.indexOf("@") != -1) 
		{
			if (email.contains("gmail")) 
			{
				if (email.endsWith(".com")) 
				{
					
					System.out.println("Your Email ID is correct");
				} 
				else 
				{
					System.out.println("Your Email ID is incorrect");
				}
			}
		}
	}
}
