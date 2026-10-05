//Outside Package Child Class

package oops.accessModifiers.Pack2;
import oops.accessModifiers.Pack1.*;
public class Citizen extends Person{
	public static void main(String[] args) {
		Citizen obj = new Citizen();
		//We can't access private variable of outside package in child class
//		obj.name = "Hello"; // Private
		
		//We can't access default variable of outside package in child class

//		obj.age = 22; //Default

		obj.height = 60; //Protected
		obj.qualification = "Phd";//Public
	}
}
