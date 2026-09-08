package oops.abstopic.Aclass.task2;
import java.util.Scanner;

public class TestApp {
	public static void getBehaveByPlace(Person person)
	{
		person.getBehave();
		if(person instanceof School)
		{
			School student = (School)person;
			student.getresult();
		}
		else if(person instanceof PublicPlace)
		{
			PublicPlace citizen = (PublicPlace)person;
			citizen.getEventInfo();
		}
		else if(person instanceof Org)
		{
			Org emp = (Org)person;
			emp.getSalary();
		}
		else if(person instanceof Home)
		{
			Home child = (Home)person;
			child.getMovieOnTime();
		}
	}
}
