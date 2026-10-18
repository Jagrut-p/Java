package string_assignment;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		String no;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Phone Number: ");
		no = sc.nextLine();
		if (no.length() == 10) {
			for (int i = 0; i < 10; i++) {
				if (no.charAt(i) >= '0' && no.charAt(i) <= '9') {
					count++;
				}
			}
			if (count == 10) {
				if (no.startsWith("9") || no.startsWith("8") || no.startsWith("7") || no.startsWith("6")) {
					System.out.println("Valid Number");
				} else {
					System.out.println("Invalid Number");
				}
			}

		}
	}
}
