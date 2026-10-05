package spaceCounter;
import java.util.Scanner;
public class TestApp 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String word;
	System.out.println("Enter the String to find number of spaces in it: ");
	word = sc.nextLine();
	for(int i=0;i<word.length();i++)
	{
		if(word.charAt(i) == ' ')
		{
			count++;
		}
	}
	System.out.println("Number of Spaces in the String: " + count);
	}
}
