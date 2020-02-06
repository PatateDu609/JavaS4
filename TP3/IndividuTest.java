package TP3;

public class IndividuTest {
	public static void main(String[] args) {
		Individu i1, i2;

		i1 = new Individu("Marie", "Dulac", null);
		i2 = new Individu("Jean", "Effort", null);

		i1.afficheInfo();
		i2.afficheInfo();

		System.out.println("\n");

		i1.marier(i2);
		i1.afficheInfo();
		i2.afficheInfo();
	}
}
