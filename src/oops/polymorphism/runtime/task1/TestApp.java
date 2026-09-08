package oops.polymorphism.runtime.task1;
import java.util.Scanner;
public class TestApp {
	public static void getBehaviourByPlace(Person person)
	{
		person.getBehave();
		if(person instanceof School)
		{
			School student = (School)person;
			student.getresult();
		}
		else if(person instanceof Job)
		{
			Job emp = (Job)person;
			emp.getSalary();
		}
		else if(person instanceof Country)
		{
			Country cit = (Country)person;
			cit.getCitizen();
		}
		else if(person instanceof Home)
		{
			Home child = (Home)person;
			child.MovieTime();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		int choice = sc.nextInt();
		Person person = null;
		switch(choice)
		{
		case 1: 
			person = new School();
			getBehaviourByPlace(person);
			break;
		case 2: 
			person = new Job();
			getBehaviourByPlace(person);
			break; 
		case 3: 
			person = new Home();
			getBehaviourByPlace(person);
			break;
		case 4: 
			person = new Country();
			getBehaviourByPlace(person);
			break;
		}
	}
}
