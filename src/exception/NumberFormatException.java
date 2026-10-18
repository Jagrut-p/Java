package exception;
import java.util.Scanner;
public class NumberFormatException 
{
	public static void main(String[] args) {
		String s1 = "1a0a";
		int no = Integer.parseInt(s1);
		System.out.println(s1);
	}
}
