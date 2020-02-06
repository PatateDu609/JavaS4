package TP3;

public class PersonnelTest {
	public static void main(String[] args) {
		Personnel p1, p2;

		p1 = new Personnel("Marie", "Dulac", 1, 1969, "10 rue des saints pères");
		p2 = new Personnel("Jean", "Effort", 0, 1980, "50 bd St Germain");

		System.out.println(p1.afficheInfo());
		System.out.println(p2.afficheInfo());
	}
}