package oops.vehicle;

import java.util.Scanner;

public class Vehicle {
	int vID;
	String vBrandName;
	Float rentprice;
	public void calculateRent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vehicle ID: ");
		vID = sc.nextInt();
		System.out.println("Enter the Vehicle Brand Name; ");
		vBrandName = sc.nextLine();
		System.out.println("Enter the vehicle Rent Price: ");
		rentprice = sc.nextFloat();
	}
	public void displayDetails()
	{
		System.out.println("Vehicle ID: " + vID);
		System.out.println("Vehicle Name: " + vBrandName);
		System.out.println("Vehicle Rent Price: " + rentprice);
	}
	public void startVehicle()
	{
		System.out.println("Vehile -- Start Vehicle");
	}
}
