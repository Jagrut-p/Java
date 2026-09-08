package product;

public class TestApp3 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product(1, "Mouse", "Apple", 1234, 1);
		Product p3 = new Product(p2);
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
	}
}