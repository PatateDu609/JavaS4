package TP2;

import javax.swing.*;

public class TestTrinome {
	public static void main(String[] args) {
		Trinome t;
		double a, b, c;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Utilisation de la classe TP2.Saisie !!!");
//
//		a = TP2.Saisie.lireEntier("a ? ");
//		b = TP2.Saisie.lireEntier("b ? ");
//		c = TP2.Saisie.lireEntier("c ? ");
//		t = new TP2.Trinome(a, b, c);
//		t.calculRacines();
//		t.afficheRacine();
//
//		System.out.println("Utilisation de la classe Scanner !!!");
//
//		System.out.println("a ? ");
//		a = sc.nextInt();
//		System.out.println("b ? ");
//		b = sc.nextInt();
//		System.out.println("c ? ");
//		c = sc.nextInt();
//		t = new TP2.Trinome(a, b, c);
//		t.calculRacines();
//		t.afficheRacine();

		a = 0.;
		b = 0.;
		c = 0.;
		System.out.println("Utilisation de la classe JOptionPane !!!");
		String s = JOptionPane.showInputDialog("a ? ");
		if (s != null)
			a = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("b ? ");
		if (s != null)
			b = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("c ? ");
		if (s != null)
			c = Integer.parseInt(s);
		t = new Trinome(a, b, c);
		t.calculRacines();
		t.afficheRacineDialog();
	}
}
