package oops.vehicle;

public class Car extends Vehicle{
	public boolean hasSunRoof;
	public void startVehile()
	{
		System.out.println("Car -- Car Started");
	}
	public void showDetails()
	{
		hasSunRoof = true;
		System.out.println("Car : Show Car Vehicle Info : Sun Roof " + hasSunRoof);
	}
	public void enableAC()
	{
		System.out.println("Car : Enable AC");
	}
}
