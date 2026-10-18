package exception;
import java.util.Scanner;
public class ArithmaticException {
	public static void main(String[] args) {		
	Scanner sc = new Scanner(System.in);
	int no1, no2;
	System.out.println("Enter the no1: ");
	no1 = sc.nextInt();
	System.out.println("Enter the no2: ");
	no2 = sc.nextInt();
	System.out.println("No1 + No2: " + (no1 / no2));
	}
}
