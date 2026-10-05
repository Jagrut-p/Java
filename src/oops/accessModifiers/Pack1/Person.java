//Same Package Same Class

package oops.accessModifiers.Pack1;

public class Person {
	private String name; //Private
	int age; //Default
	protected int height; //Protected
	public String qualification; //Public

	public static void main(String[] args) {

		Person obj = new Person();
		obj.name = "Hello";
		obj.age = 20;
		obj.height = 66;
		obj.qualification = "Phd";
	}
	
}
