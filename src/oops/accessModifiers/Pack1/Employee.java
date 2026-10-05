//SAME Package Other Class
package oops.accessModifiers.Pack1;
public class Employee {
	public static void main(String[] args) {
		Person obj = new Person();
		//We can't access private variable in same package but other class
//		obj.name = "Hello"; //private

		obj.age = 20;	//default
		obj.qualification = "Phd"; //protected
		obj.height = 60;//public
	}
}
