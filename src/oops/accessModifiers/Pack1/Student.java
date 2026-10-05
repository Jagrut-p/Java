//Same Package Child Class

package oops.accessModifiers.Pack1;

public class Student extends Person{
	public static void main(String[] args) {
		Student obj = new Student();
//		Name can't be access in child class in case of private access specifier
//		obj.name = "Hello"; //Private
		obj.age = 21; //Default
		obj.height = 60;//Protected
		obj.qualification = "Phd"; //Public
	}
}
