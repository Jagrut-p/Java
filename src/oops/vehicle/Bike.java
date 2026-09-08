package oops.vehicle;

public class Bike extends Vehicle{
	public boolean hasHelmet;
	public void startVehicle()
	{
		System.out.println("Bike - Get Started");
	}
	public void displayDetails()
	{
		hasHelmet = true;
		System.out.println("Bike : Show Vehicle Info - hasHelmet: "  + hasHelmet);
	}
	public void provideHelmet()
	{
		System.out.println("Bike: Provide Helmet");
	}
}
