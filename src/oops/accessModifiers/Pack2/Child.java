//Outside Package Child Class

package oops.accessModifiers.Pack2;
import oops.accessModifiers.Pack1.Person;
public class Child {
	public static void main(String[] args) {
		Person obj = new Person();
		//We can't access private variable in outside package other class
//		obj.name = "Hello";//Private
		//We can't access default variable in outside package other class
//		obj.age = 23;//Default
		//We can't access protected variable in outside package other class
//		obj.height = 60; //Protected
		obj.qualification = "Phd"; //Public
	}
}
