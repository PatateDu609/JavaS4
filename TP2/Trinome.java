package TP2;

import javax.swing.*;

public class Trinome {
	private double a, b, c;
	private double delta;
	private double r1, r2;

	public Trinome(double c1, double c2, double c3) {
		a = c1;
		b = c2;
		c = c3;
		delta = 0;
		r1 = 0;
		r2 = 0;
	}

	public void calculRacines() {
		delta = (b * b) - (4 * a * c);

		if (delta > 0) {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
		} else if (delta == 0) {
			r1 = -b / (2 * a);
		}
	}

	public void afficheRacine() {
		if (delta > 0)
			System.out.println("Il y a deux solutions et qui sont : r1 = " + r1 + " et r2 = " + r2);
		else if (delta == 0)
			System.out.println("Il y a une seule solution qui est : r = " + r1);
		else
			System.out.println("Il n'y a pas de solutions réelles");
	}

	public void afficheRacineDialog() {
		if (delta > 0)
			JOptionPane.showMessageDialog(null, "Il y a deux solutions et qui sont : r1 = " + r1 + " et r2 = " + r2);
		else if (delta == 0)
			JOptionPane.showMessageDialog(null, "Il y a une seule solution qui est : r = " + r1);
		else
			JOptionPane.showMessageDialog(null, "Il n'y a pas de solutions réelles");
	}
}
