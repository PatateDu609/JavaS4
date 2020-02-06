package TP4;

public class TestTriNombres {
	public static void main(String[] args) {
		TriNombres t = new TriNombres();
		int[] array = {5, 42, 4054, 444, 1, 0, 2, 25, 9};

		t.setArray(array);

		System.out.println("Tableau avant tri");
		t.afficher();
		t.sort();
		System.out.println("Tableau après tri");
		t.afficher();
	}
}
