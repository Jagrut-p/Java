package tryWithMultipleCatch1;
import java.util.Scanner;
public class TestApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no1, no2, ans;
		int arr[] = new int[5];
		System.out.println("Enter No1: ");
		no1 = sc.nextInt();
		System.out.println("Enter No2: ");
		no2 = sc.nextInt();
		ans = no1 / no2;
		try {
			String name = null;
			System.out.println(ans);
			System.out.println(name.length());
			arr[5] = 100;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
