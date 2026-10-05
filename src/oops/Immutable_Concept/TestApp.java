package oops.Immutable_Concept;

public class TestApp {
	public static void main(String[] args) {
		String name1 = "Hello";
		String name2 = "World";
		System.out.println("Name1: " + name1 + ", Name1 HashCode: " + name1.hashCode());
		System.out.println("Name2: " + name2 + ", Name2 HashCode: " + name2.hashCode());
		String name3 = name1.concat(name2);
		name1 = name2;
		System.out.println("Name3: " + name3 + ", Name2 HashCode: " + name3.hashCode());
		System.out.println("Name1: " + name1 + ", Name1 HashCode: " + name1.hashCode());
	}
}
