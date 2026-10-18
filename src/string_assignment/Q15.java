package string_assignment;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) 
	{
		String oe;
		Scanner sc = new Scanner(System.in);
		oe = sc.nextLine();
		if (oe.startsWith("emp") && oe.endsWith(".com")) 
		{
		if (oe.contains("@royaltechnosoft")) 
			{
				int a = oe.indexOf("@");
				if (oe.substring(0, a).length() >= 5) 
				{
					System.out.println("Valid Company Email");
				} 
				else 
				{
					System.out.println("Try Again");
				}
			}
		}
	}
}
