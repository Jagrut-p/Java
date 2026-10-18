package exception;
import java.util.Scanner;
public class NullPointerException {
	public static void main(String[] args) {		
	Scanner sc = new Scanner(System.in);
	String s = null;
	System.out.println(s.charAt(0));
	}
}
