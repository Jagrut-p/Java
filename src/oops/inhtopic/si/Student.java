package oops.inhtopic.si;
import java.util.Scanner;
public class Student extends Person
{
	int rno, std, fees;
	double attendence, aper;
	public void ScanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Studnet: ");
		name = sc.nextLine();
		System.out.println("Enter the Roll No of the Student: ");
		rno = sc.nextInt();
		System.out.println("Enter the Std: ");
		std = sc.nextInt();
		System.out.println("Enter the fees of the Student:  ");
		fees = sc.nextInt();
		System.out.println("Enter the Attendence of the Student: ");
		attendence = sc.nextDouble();
		calculate();
	}
	public double calculate()
	{
		aper = (attendence * 100) / 26;
		return aper;
	}
	public void displayData()
	{
		System.out.println("Name: " + name + "Roll No: " + rno + "Std: " + std + "fees: " + fees + "Average Percentage of Attendence: " + aper);
	}
	public static void main(String[] args) 
	{
		
	}
}
