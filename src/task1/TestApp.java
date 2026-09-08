package task1;

public class TestApp {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Hello",1,2,12);
		Employee e2[] = new Employee[3];
		Employee e3 = new Employee();
		Employee e4 = new Employee(e1);
		for(int i=0;i<e2.length;i++)
		{
			e2[i] = new Employee();
			e2[i].getData();
		}
		for(int i=0;i<e2.length;i++)
		{
			e2[i].display();
		}
		e1.display();
		e3.display();
		e4.display();
	}
}
