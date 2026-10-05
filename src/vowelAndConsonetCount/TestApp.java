package vowelAndConsonetCount;
import java.util.Scanner;
public class TestApp 
{
public static void main(String[] args) 
{
	String word;
	int i;
	int vcount = 0;
	int ccount = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name : ");
	word = sc.nextLine();
	for(i=0;i<word.length();i++)
	{
		if(word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' 
				|| word.charAt(i) == 'O' || word.charAt(i) == 'U' 
				|| word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' 
				|| word.charAt(i) == 'i' || word.charAt(i) == 'u')
		{
			vcount++;
		}
		else
		{
			ccount++;
		}
	}
	System.out.println("Number of Vowels: " + vcount);
	System.out.println("Number of Consonet: " + ccount);
	}	
}
