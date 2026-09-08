package oops.inhtopic.hierarchicalinh;

public class TestApp {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Hello", 123,"CEO");
		e1.display();
		Student s1 = new Student(1, "Ola", 12,334);
		s1.display();
	}
}
