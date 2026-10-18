package wordReverseInSentence;

import java.util.Scanner;

public class TestApp 
{
	public static void main(String[] args) 
	{
		int count = 0, i, k = 0;
		int[] index = new int[10];
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		word = sc.nextLine();
		// Hello World, Today is first Day of Navratri
		for (i = 0; i < word.length(); i++) 
		{
			if(word.charAt(i) == ' ')
			{
				index[count] = i;
				count++;
			}
		}
//		index[(word.length())] = ' ';
//		count++;
//		index[count] = '\n';
		int l = 0;
		for(i=0;i!='\n';i++)
		{
			for(int j=index[i];j>=l;j--)
			{
				System.out.print(word.charAt(j));
			}
			l = index[i];
		}
//		System.out.println(word.length());
		for(i=word.length() - 1;word.charAt(i) != ' ';i--)
		{
			System.out.print(word.charAt(i));
		}
	}
}
