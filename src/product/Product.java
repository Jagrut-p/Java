package product;

public class Product {
	private int productID;
	private String productName;	
	private String brand;
	private float price;
	private int quantity;
	Product()
	{
		this.productID = 0;
		this.productName = "Unknwon" ;
		this.brand = "No Brand";
		this.price = 0;
		this.quantity = 0;
	}
	Product(int productID, String productName, String brand, float price, int quantity)
	{
		this.productID = productID;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	Product(Product p)
	{
		this.productID = p.productID;
		this.productName = p.productName;
		this.brand = p.brand;
		this.price = p.price;
		this.quantity = p.quantity;
	}
	public void displayProduct()
	{
		System.out.println("Product ID: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
