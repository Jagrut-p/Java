package paraconstructor;

public class TestApp5 {
	public static void main(String[] args) {
		student s1 = new student(1, "hello", 12, 12345);
		student s2 = new student(2, "world", 12);
		student s3 = new student(3, "Gracias");
		student s4 = new student(4);
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
	}
}