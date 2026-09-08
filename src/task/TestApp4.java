package task;
public class TestApp4 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "Hello", 1234);
		Employee e3 = new Employee(e2);
		e1.display();
		e2.display();
		e3.display();
	}
}