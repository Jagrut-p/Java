package compareToIgnoreCase;

public class compareToIgnoreCase {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HELLO";
		if(s1.compareToIgnoreCase(s2) == 0)
		{
			System.out.println("Both have same String but might have differenet case");
		}
		else
		{
			System.out.println("Both have different String but might have different case");
		}
	}
}
