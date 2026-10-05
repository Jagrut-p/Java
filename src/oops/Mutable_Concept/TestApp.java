package oops.Mutable_Concept;

public class TestApp {
	public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder("Royal");
	StringBuffer sb = new StringBuffer("Royal");
	System.out.println("SB: " + sb + "SB - HashCode: " + sb.hashCode());
	sb.append("Technosoft");
	System.out.println("SB: " + sb + "SB - HashCode: " + sb.hashCode());
	}
}
