package EqualToIgnoreCase;

public class equalsToIgnoreCase {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HELLO";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Both are Same but case is Ignored");
		}
		else
		{
			System.out.println("Both are Differnet but case is Ignored");
		}
	}
}
