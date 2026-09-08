package constructor;

public class display {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ankur", 1000, 12);
		s1.display();
		Student s2 = new Student(s1);
		s1.display();
	}
}