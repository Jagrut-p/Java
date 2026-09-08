package employees;

public class Employees2 {
	private int eID;
	private String name;
	private int Salary;
	private String design;
	private String orgName;

	Employees2() {
		System.out.println("DEFAULT CONSTRUCOTR");
	}

	Employees2(int eID) {
		System.out.println("PARAMETERIZED Only One");
		this.eID = eID;
	}

	Employees2(int eID, String name) {
		this(eID);
		System.out.println("PARAMETERIZED(TWO)");
		this.name = name;
	}

	Employees2(int eID, String name, int Salary) {
		this(eID, name);
		System.out.println("PARAMETERIZED(THREE)");
		this.Salary = Salary;
	}

	Employees2(int eID, String name, int Salary, String design) {
		this(eID, name, Salary);
		System.out.println("PARA(FOUR)");
		this.design = design;
	}
	Employees2(int eID, String name, int Salary, String design, String orgName) {
		this(eID, name, Salary, design);
		System.out.println("PARA(FIVE)");
		this.orgName = orgName;
	}
	public void disData() {
		System.out.println(eID + " " + name + " " + Salary + " " + design + " " + orgName);
		System.out.println("----------------------------------------------------------------------------------------------");
	}
}
